package com.example.practica_5;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    String TOTAL,TOTAL2;
    CheckBox CB1,CB2,CB3;
    RadioButton RB1,RB2,RB3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CB1= findViewById(R.id.CHET1);
        CB2= findViewById(R.id.CHET2);
        CB3=(CheckBox)findViewById(R.id.CHET3);
        RB1=(RadioButton)findViewById(R.id.RADI1);
        RB2=(RadioButton)findViewById(R.id.RADI2);
        RB3=(RadioButton)findViewById(R.id.REDI3);
    }
    public void BOTON(View view){
         //GENERAR UN FOR PARA QUE RECORRA CB1,CB2,CB3 PARA DETECTAR CUAL ES EL ACTIVO

        TOTAL = "Estado: " + (CB1.isChecked() ? "El boton CB1 Marcado" : "El boton CB1 No Marcado") + (CB2.isChecked() ? "El boton CB2 Marcado" : " El boton CB2 No Marcado") + (CB3.isChecked() ? " El boton CB3 Marcado" : "El boton CB3 No Marcado");
        Toast.makeText(this, TOTAL, Toast.LENGTH_LONG).show();
        //gerenar un if para que eleccion conlos RB1

        if(RB1.isChecked()==true||RB2.isChecked()==true||RB3.isChecked()==true) {
            TOTAL2 = "Estado: " + (RB1.isChecked() ? "Marcado" : "No Marcado") + (RB2.isChecked() ? "Marcado" : "No Marcado") + (RB3.isChecked() ? "Marcado" : "No Marcado");
            //tomar los valores  que fueron verdaderos y mandarlos en el toast
            Toast.makeText(this, TOTAL2, Toast.LENGTH_LONG).show();
        }
        }

}