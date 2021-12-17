package com.example.examenPazRojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import examenPazRojas.R;

public class Home_act extends AppCompatActivity {
    private VideoView videoview;
    private Button boton1,boton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        boton1 = findViewById(R.id.btn1);
        boton2 = findViewById(R.id.btn2);
        videoview = findViewById(R.id.vw);
        String ruta = "android.resource://"+ getPackageName() + "/" + R.raw.video;

        Uri uri = Uri.parse(ruta);
        videoview.setVideoURI(uri);
        videoview.start();

        MediaController media = new MediaController(this);
        videoview.setMediaController(media);
    }


    public void gestionFichas(View view){
        Intent i = new Intent(getBaseContext(),Gestion_Animales_act.class);
        startActivity(i);
    }

    public void calculoIngresos(View view){
        Intent i = new Intent(getBaseContext(),Ingresos_act.class);
        startActivity(i);
    }
}