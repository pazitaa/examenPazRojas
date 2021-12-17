package com.example.examenPazRojas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.examenPazRojas.database.AdminSQLiteOpenHelper;

import examenPazRojas.R;

public class Gestion_Animales_act extends AppCompatActivity {

    private EditText ficha, nombre, tipo, edad, enfermedad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_animales);

        ficha=findViewById(R.id.etFicha);
        nombre=findViewById(R.id.etNombre);
        tipo=findViewById(R.id.etTipo);
        edad=findViewById(R.id.etEdad);
        enfermedad=findViewById(R.id.etEnfermedad);

    }
    public void añadirFicha(View view){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "examenFinal", null,1);
        SQLiteDatabase db = admin.getWritableDatabase();


        String fichaAnimal = ficha.getText().toString();
        String nombreAnimal = nombre.getText().toString();
        String tipoAnimal = tipo.getText().toString();
        String edadAnimal = edad.getText().toString();
        String enfermedadAnimal = enfermedad.getText().toString();

        if(!fichaAnimal.isEmpty() && !nombreAnimal.isEmpty() && !tipoAnimal.isEmpty() && !edadAnimal.isEmpty() && !enfermedadAnimal.isEmpty()){

            ContentValues cont = new ContentValues();
            cont.put("Ficha Animal",fichaAnimal);
            cont.put("Nombre Animal", nombreAnimal);
            cont.put("Tipo Animal", tipoAnimal);
            cont.put("Edad Animal", edadAnimal);
            cont.put("Enfermedad Animal", enfermedadAnimal);

            db.insert("animales", null, cont);
            db.close();
            Toast.makeText(getBaseContext(), "Has guardado una clase.", Toast.LENGTH_SHORT).show();

        }else
        {
            Toast.makeText(getBaseContext(),"Hay campos vacios ..", Toast.LENGTH_SHORT).show();
        }

    }




    public void mostrarFicha(View view){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "examenFinal", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String fichaAnimal = ficha.getText().toString();

        if(!fichaAnimal.isEmpty()){

            Cursor file = db.rawQuery("SELECT nombre, tipo, edad, enfermedad FROM animales WHERE ficha"+ficha, null);

            if(file.moveToFirst())
            {
                ficha.setText(file.getString(0));
                nombre.setText(file.getString(1));

            }else
            {
                Toast.makeText(getBaseContext(),"No hay ficha asociada", Toast.LENGTH_SHORT).show();
            }


        }else
        {
            Toast.makeText(getBaseContext(), "La ficha viene vacio", Toast.LENGTH_SHORT).show();
        }

    }

    
    public void eliminarFicha(View view){

        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "examenFinal", null, 1);
        SQLiteDatabase db = admin.getWritableDatabase();

        String fichaAnimal = ficha.getText().toString();

        if(!fichaAnimal.isEmpty()){

            db.delete("animales", "ficha ="+fichaAnimal, null);
            db.close();
            Toast.makeText(getBaseContext(),"Has eliminado una ficha: "+fichaAnimal, Toast.LENGTH_LONG).show();
        }else
        {
            Toast.makeText(getBaseContext(),"No debe venir vacio", Toast.LENGTH_LONG).show();
        }

    }

}