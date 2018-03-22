package com.example.win81.calcul;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public TextView pant;
    public double operan1, operan2, res;
    int ope;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pant=(TextView)findViewById(R.id.argumento);
        View sum=findViewById(R.id.mas);
        sum.setOnClickListener(this);

        View res=findViewById(R.id.menos);
        res.setOnClickListener(this);

        View mul=findViewById(R.id.por);
        mul.setOnClickListener(this);

        View div=findViewById(R.id.entre);
        div.setOnClickListener(this);

        View cero=findViewById(R.id.n0);
        cero.setOnClickListener(this);

        View uno=findViewById(R.id.n1);
        uno.setOnClickListener(this);

        View dos=findViewById(R.id.n2);
        dos.setOnClickListener(this);

        View tres=findViewById(R.id.n3);
        tres.setOnClickListener(this);

        View cuatro=findViewById(R.id.n4);
        cuatro.setOnClickListener(this);

        View cinco=findViewById(R.id.n5);
        cinco.setOnClickListener(this);

        View seis=findViewById(R.id.n6);
        seis.setOnClickListener(this);

        View siete=findViewById(R.id.n7);
        siete.setOnClickListener(this);

        View ocho=findViewById(R.id.n8);
        ocho.setOnClickListener(this);

        View nueve=findViewById(R.id.n9);
        nueve.setOnClickListener(this);

        View pnto=findViewById(R.id.punto);
        pnto.setOnClickListener(this);

        View ig=findViewById(R.id.igual);
        ig.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.n0)
            bt0(v);

        else if (v.getId()==R.id.n1)
            bt1(v);

        else if(v.getId()==R.id.n2)
            bt2(v);
        else  if(v.getId()==R.id.n3)
            bt3(v);
        else if(v.getId()==R.id.n4)
            bt4(v);
        else if(v.getId()==R.id.n5)
            bt5(v);
        else if(v.getId()==R.id.n6)
            bt6(v);
        else if(v.getId()==R.id.n7)
            bt7(v);
        else if(v.getId()==R.id.n8)
            bt8(v);
        else if(v.getId()==R.id.n9)
            bt9(v);
        else if (v.getId()==R.id.punto)
            btpunt(v);
        else if(v.getId()==R.id.mas)
            suma(v);

        else if(v.getId()==R.id.menos){
            resta(v);
        }

        else if (v.getId()==R.id.por)
            multiplicacion(v);
        else if(v.getId()==R.id.entre)
            division(v);
        else if (v.getId()==R.id.igual)
            igual(v);

        }

    public void bt1 (View v){
        String cap= pant.getText().toString();
        cap=cap+"1";
        pant.setText(cap);
    }

    public void bt2 (View v){
        String cap= pant.getText().toString();
        cap=cap+"2";
        pant.setText(cap);

    }
    public void bt3 (View v){
        String cap= pant.getText().toString();
        cap=cap+"3";
        pant.setText(cap);

    }
    public void bt4 (View v){
        String cap= pant.getText().toString();
        cap=cap+"4";
        pant.setText(cap);

    }
    public void bt5 (View v){
        String cap= pant.getText().toString();
        cap=cap+"5";
        pant.setText(cap);

    }
    public void bt6 (View v){
        String cap= pant.getText().toString();
        cap=cap+"6";
        pant.setText(cap);

    }
    public void bt7 (View v){
        String cap= pant.getText().toString();
        cap=cap+"7";
        pant.setText(cap);

    }
    public void bt8 (View v){
        String cap= pant.getText().toString();
        cap=cap+"8";
        pant.setText(cap);
    }

    public void bt9 (View v){
        String cap= pant.getText().toString();
        cap=cap+"9";
        pant.setText(cap);
    }

    public void bt0 (View v){
        String cap= pant.getText().toString();
        cap=cap+"0";
        pant.setText(cap);

    }

    public void btpunt (View v){
        String cap=pant.getText().toString();
        cap=cap+".";
        pant.setText(cap);
    }


    public void suma(View v){

        TextView resultado=(TextView) findViewById(R.id.resultado);

        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);

        }catch(NumberFormatException nfe){}

        pant.setText("");
        ope=1;
    }

    public void resta(View v){

        TextView resultado=(TextView) findViewById(R.id.resultado);
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);

        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=2;
    }
    public void multiplicacion (View v){

        TextView resultado=(TextView) findViewById(R.id.resultado);
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);

        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=3;
    }

    public void division (View v){

        TextView resultado=(TextView) findViewById(R.id.resultado);
        try{
            String aux1= pant.getText().toString();
            operan1= Double.parseDouble(aux1);

        }catch(NumberFormatException nfe){};
        pant.setText("");
        ope=4;
    }
    public void igual (View v){
        TextView resultado=(TextView) findViewById(R.id.resultado);
        try{
            String aux2= pant.getText().toString();
            operan2= Double.parseDouble(aux2);

        }catch(NumberFormatException nfe){};
        pant.setText("");

        if (ope==1){
            res=operan1+operan2;

        }else if (ope==2){
            res=operan1-operan2;

        }else if (ope==3){
            res=operan1*operan2;

        }else if (ope==4){
            if(operan2==0){
                pant.setText("Numero no se puede dividir para 0");
            }else{
                res= operan1/operan2;
            }
            }
        resultado.setText("R= "+res);
        operan1=res;
        }

    }