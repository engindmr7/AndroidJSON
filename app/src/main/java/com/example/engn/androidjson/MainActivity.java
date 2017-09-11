package com.example.engn.androidjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button tık;
    public static TextView data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tık =(Button)findViewById(R.id.button);
        data=(TextView)findViewById(R.id.txtjson);

        tık.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSON process = new JSON();
                process.execute();
            }
        });


    }
}
