package com.example.examenPazRojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Objetos.Administrador;
import examenPazRojas.R;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass;
    private TextView msj;
    private Button btn1;
    private Administrador adm = new Administrador();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = findViewById(R.id.etUser);
        pass = findViewById(R.id.etPass);
        btn1 = findViewById(R.id.btn1);
        msj = findViewById(R.id.msj);
    }

    public void iniciarSesion(View view){
        String val_user = user.getText().toString();
        String val_pass = pass.getText().toString();

        if(val_user !=("Paz") && val_pass!=("123")){
            msj.setText("USUARIO INVALIDO");
        }
        if(val_user.equals("") && val_pass.equals("")){
            msj.setText("COMPLETAR LOS CAMPOS");
            
        }
        if(val_user.equals("Paz")&& val_pass.equals("123")){
            Intent intent = new Intent(MainActivity.this,Home_act.class);
            startActivity(intent);
        }
    }
}