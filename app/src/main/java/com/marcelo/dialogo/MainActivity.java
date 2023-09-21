package com.marcelo.dialogo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void salir(View view){
        AlertDialog.Builder alerDialogBuilder = new AlertDialog.Builder( this);
        alerDialogBuilder.setTitle("Advertencia");
        alerDialogBuilder.setIcon(R.drawable.bombilla);
        alerDialogBuilder.setMessage("Desea salir de la aplicación");
        alerDialogBuilder.setCancelable(false); //solo si se toca los botones realiza una accion
        alerDialogBuilder.setPositiveButton("SI", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                finish();
            }
        });
        alerDialogBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
                Toast.makeText(MainActivity.this, "Has seleccionado No", Toast.LENGTH_LONG).show();
            }
        });
        alerDialogBuilder.setNeutralButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface arg0, int arg1) {
            Toast.makeText(MainActivity.this, "Has seleccionado Cancelar", Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog alertDialog = alerDialogBuilder.create();
        alertDialog.show();
    }
}
