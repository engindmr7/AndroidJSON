package com.example.engn.androidjson;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;



public class JSON extends AsyncTask<Void,Void,Void> {

    String data ="";



    @Override
    protected Void doInBackground(Void... voids) {

        try {
            URL url = new URL("https://api.myjson.com/bins/9zfbl");

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            InputStream ınputStream = httpURLConnection.getInputStream();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ınputStream));

            String line = "";
            while (line != null){

                line = bufferedReader.readLine();

                data = data + line;
            }




        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        return null;
    }



    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);


        MainActivity.data.setText(this.data);

    }
}
