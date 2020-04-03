package com.example.find;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void startmainActivity (View view){
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);
    }
    public void startamericanasActivity (View view){
        Intent americanasActivity = new Intent(this, americanasActivity.class);
        startActivity(americanasActivity);
    }
    public void startmercadoActivity (View view){
        Intent mercadoActivity = new Intent(this, mercadoActivity.class);
        startActivity(mercadoActivity);
    }
    public void startnetActivity (View view){
        Intent netActivity = new Intent(this, netActivity.class);
        startActivity(netActivity);
    }
    public void startwebActivity (View view){
        Intent webActivity = new Intent(this, webActivity.class);
        startActivity(webActivity);
    }
    public void startsobreActivity (View view){
        Intent sobreActivity = new Intent(this, sobreActivity.class);
        startActivity(sobreActivity);
    }
}
