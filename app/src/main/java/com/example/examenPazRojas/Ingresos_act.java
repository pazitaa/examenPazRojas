package com.example.examenPazRojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import Objetos.Animal;
import Objetos.Enfermedad;
import examenPazRojas.R;

public class Ingresos_act extends AppCompatActivity {

    private Spinner spn1,spn2;
    private Animal an = new Animal();
    private Button btn1, btn2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresos);

        spn1= findViewById(R.id.spn);
        spn2=findViewById(R.id.spn2);
        btn1=findViewById(R.id.btnCotizar);
        btn2=findViewById(R.id.btnVolver);
        tvResult=findViewById(R.id.tvResultado);

        Animal a = new Animal();
        Enfermedad e = new Enfermedad();

        ArrayAdapter adaptAnimales = new ArrayAdapter(this, android.R.layout.simple_list_item_1, a.getNombre());
        spn1.setAdapter(adaptAnimales);
        ArrayAdapter adaptEnfermedad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, e.getNombre());
        spn2.setAdapter(adaptEnfermedad);

    }


    public void cotizarTratamiento(View view){
        Animal a = new Animal();
        Enfermedad e = new Enfermedad();

        if(spn1.getSelectedItem().toString().equals("Animal Domestico") &&
                spn2.getSelectedItem().toString().equals("Brucelosis")) {
            tvResult.setText("La cotizacion final es:"+a.cal1());
        }
        if(spn1.getSelectedItem().toString().equals("Animal Domestico") &&
                spn2.getSelectedItem().toString().equals("Fiebre Aftosa")) {
            tvResult.setText("La cotizacion final es:"+a.cal2());
        }
        if(spn1.getSelectedItem().toString().equals("Animal Domestico") &&
                spn2.getSelectedItem().toString().equals("Salmonella")) {
            tvResult.setText("La cotizacion final es:"+a.cal3());
        }
        if(spn1.getSelectedItem().toString().equals("Animal Domestico") &&
                spn2.getSelectedItem().toString().equals("Rabia")) {
            tvResult.setText("La cotizacion final es:"+a.cal4());
        }



        if(spn1.getSelectedItem().toString().equals("Animal Salvaje") &&
                spn2.getSelectedItem().toString().equals("Brucelosis")) {
            tvResult.setText("La cotizacion final es:"+a.cal5());
        }
        if(spn1.getSelectedItem().toString().equals("Animal Salvaje") &&
                spn2.getSelectedItem().toString().equals("Fiebre Aftosa")) {
            tvResult.setText("La cotizacion final es:"+a.cal6());
        }
        if(spn1.getSelectedItem().toString().equals("Animal Salvaje") &&
                spn2.getSelectedItem().toString().equals("Salmonella")) {
            tvResult.setText("La cotizacion final es:"+a.cal7());
        }
        if(spn1.getSelectedItem().toString().equals("Animal Salvaje") &&
                spn2.getSelectedItem().toString().equals("Rabia")) {
            tvResult.setText("La cotizacion final es:"+a.cal8());



        }
        if(spn1.getSelectedItem().toString().equals("Otros") &&
                spn2.getSelectedItem().toString().equals("Brucelosis")) {
            tvResult.setText("La cotizacion final es:"+a.cal9());
        }
        if(spn1.getSelectedItem().toString().equals("Otros") &&
                spn2.getSelectedItem().toString().equals("Fiebre Aftosa")) {
            tvResult.setText("La cotizacion final es:"+a.cal10());
        }
        if(spn1.getSelectedItem().toString().equals("Otros") &&
                spn2.getSelectedItem().toString().equals("Salmonella")) {
            tvResult.setText("La cotizacion final es:"+a.cal11());
        }
        if(spn1.getSelectedItem().toString().equals("Otros") &&
                spn2.getSelectedItem().toString().equals("Rabia")) {
            tvResult.setText("La cotizacion final es:"+a.cal12());
        }

    }

    public void volverMenu(View view){
        Intent intent = new Intent(this,Home_act.class);
    }

}