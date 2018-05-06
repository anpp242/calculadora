package com.edu.omar.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class calculadora extends AppCompatActivity {

    private EditText pant;
    private Double operacion1, operacion2, respuesta;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

    pant = (EditText)findViewById(R.id.caja);
    }

    //MÉTODOS PARA LOS BOTONES DE LOS NÚMEROS

    public void btn1(View v){
        String cap = pant.getText().toString();
        cap = cap+"1";
        pant.setText(cap);
    }

    public void btn2(View v){
        String cap = pant.getText().toString();
        cap = cap+"2";
        pant.setText(cap);
    }

    public void btn3(View v){
        String cap = pant.getText().toString();
        cap = cap+"3";
        pant.setText(cap);
    }

    public void btn4(View v){
        String cap = pant.getText().toString();
        cap = cap+"4";
        pant.setText(cap);
    }

    public void btn5(View v){
        String cap = pant.getText().toString();
        cap = cap+"5";
        pant.setText(cap);
    }

    public void btn6(View v){
        String cap = pant.getText().toString();
        cap = cap+"6";
        pant.setText(cap);
    }

    public void btn7(View v){
        String cap = pant.getText().toString();
        cap = cap+"7";
        pant.setText(cap);
    }

    public void btn8(View v){
        String cap = pant.getText().toString();
        cap = cap+"8";
        pant.setText(cap);
    }

    public void btn9(View v){
        String cap = pant.getText().toString();
        cap = cap+"9";
        pant.setText(cap);
    }

    public void btnpto(View v){
        String cap = pant.getText().toString();
        cap = cap+".";
        pant.setText(cap);
    }

    public void btn0(View v){
        String cap = pant.getText().toString();
        cap = cap+"0";
        pant.setText(cap);
    }
    //MÉTODOS PARA LAS OPERACIONES

    public void btn_suma(View v){
        try{
            String aux1 = pant.getText().toString();
            operacion1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}

        pant.setText("");
        ope = 1;
    }

    public void btn_resta(View v){
        try{
            String aux1 = pant.getText().toString();
            operacion1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}

        pant.setText("");
        ope = 2;
    }

    public void btn_multiplica(View v){
        try{
            String aux1 = pant.getText().toString();
            operacion1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}

        pant.setText("");
        ope = 3;
    }

    public void btn_divide(View v){
        try{
            String aux1 = pant.getText().toString();
            operacion1 = Double.parseDouble(aux1);
        }catch (NumberFormatException nfe){}

        pant.setText("");
        ope = 4;
    }


    //MÉTODO PARA EL RESULTADO

    public void btn_resultado(View v){
        try{
            String aux2 = pant.getText().toString();
            operacion2 = Double.parseDouble(aux2);
        }catch (NumberFormatException nfe){}
        pant.setText("");

        if(ope == 1){
            respuesta = operacion1 + operacion2;
        }else if(ope == 2){
            respuesta = operacion1-operacion2;
        }else if(ope == 3){
            respuesta = operacion1*operacion2;
        }else if(ope == 4){
            respuesta = operacion1 / operacion2;
        }

        pant.setText(""+respuesta);
        operacion1 = respuesta;
    }

    //MÉTODO LIMPIAR
    public void btn_limpiar(View v){
        pant.setText("");
        operacion1 = 0.0;
        operacion2 = 0.0;
        respuesta = 0.0;
    }

    //MÉTODO BOTÓN CERRAR

    public void btn_cerrar(View v){
        finish();
    }
    
}


