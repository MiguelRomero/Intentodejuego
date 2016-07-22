package com.example.migueleduardo.intentodejuego;

import android.support.annotation.IntegerRes;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private TextView score;
    private TextView Mensaje;
    private Button boton5;
    private Button boton6;
    private String intento,intento2,scoretotal;
    private int posible,scoreparcial=0;
    Random r = new Random();
    private int setbtn1= r.nextInt(80 - 65) + 65;

    private int setbtn2=r.nextInt(80 - 65) + 65;

    private int setbtn3=r.nextInt(80 - 65) + 65;

    private int setbtn4=r.nextInt(80 - 65) + 65;

    private int setbtn5=r.nextInt(80 - 65) + 65;

    private int setbtn6=r.nextInt(80 - 65) + 65;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = (Button)findViewById(R.id.button);
        boton2=(Button) findViewById(R.id.button2);
        boton3=(Button)findViewById(R.id.button3);
        boton4=(Button)findViewById(R.id.button4);
        boton5=(Button)findViewById(R.id.button5);
        boton6=(Button)findViewById(R.id.button6);
        score=(TextView)findViewById(R.id.textView);
        Mensaje=(TextView)findViewById(R.id.textView2);
        score.setText("Puntaje");
        Mensaje.setText("Aun no ganas");
        if(setbtn1%2==0){
            boton1.setText("1");
        }
        if(setbtn1%2!=0){
            boton1.setText("0");
        }
        if(setbtn2%2!=0){
            boton2.setText("1");
        }
        if(setbtn2%2==0){
            boton2.setText("0");
        }
        if(setbtn3%2!=0){
            boton3.setText("1");
        }
        if(setbtn3%2==0){
            boton3.setText("0");
        }
        if(setbtn4%2==0){
            boton4.setText("1");
        }
        if(setbtn4%2!=0){
            boton4.setText("0");
        }
        if(setbtn5%2==0){
            boton5.setText("1");
        }
        if(setbtn5%2!=0){
            boton5.setText("0");
        }
        if(setbtn6%2!=0){
            boton6.setText("1");
        }
        if(setbtn6%2==0){
            boton6.setText("0");
        }

    }
    public void presiono1(View view){
        boton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                intento=boton2.getText().toString();
                posible=Integer.parseInt(intento);
                if(posible==1){
                    scoreparcial=scoreparcial+1;
                    boton2.setText("0");


                }
                if(posible==0){
                    scoreparcial=scoreparcial+1;
                    boton2.setText("1");


                }
                scoretotal= String.valueOf(scoreparcial);
                score.setText(scoretotal);
                verificar();
            }
        });

    }
    public void presiono2(View view){
        boton2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view1){

                intento = boton1.getText().toString();
                intento2= boton3.getText().toString();
                posible=Integer.parseInt(intento);
                if(posible==1){
                    scoreparcial=scoreparcial+1;
                    boton1.setText("0");


                }
                if(posible==0){
                    scoreparcial=scoreparcial+1;
                    boton1.setText("1");


                }
                posible=Integer.parseInt(intento2);
                if(posible==1){

                    boton3.setText("0");


                }
                if(posible==0){

                    boton3.setText("1");


                }
                scoretotal= String.valueOf(scoreparcial);
                score.setText(scoretotal);
                verificar();
            }
        });
    }
        public void presiono3(View view){
            boton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    intento=boton2.getText().toString();
                    intento2=boton4.getText().toString();
                    posible=Integer.parseInt(intento);
                    if(posible==1){
                        scoreparcial=scoreparcial+1;
                        boton2.setText("0");

                    }
                    if(posible==0){
                        scoreparcial=scoreparcial+1;
                        boton2.setText("1");


                    }
                    posible=Integer.parseInt(intento2);
                    if(posible==1){

                        boton4.setText("0");
                    }
                    if(posible==0){

                        boton4.setText("1");
                    }
                    scoretotal= String.valueOf(scoreparcial);
                    score.setText(scoretotal);
                    verificar();
                }
            });
        }
    public void presiono4(View view){
        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intento=boton3.getText().toString();
                intento2=boton5.getText().toString();
                posible=Integer.parseInt(intento);
                if(posible==1){
                    scoreparcial=scoreparcial+1;
                    boton3.setText("0");
                }
                if(posible==0){
                    scoreparcial=scoreparcial+1;
                    boton3.setText("1");
                }
                posible=Integer.parseInt(intento2);
                if(posible==1){

                    boton5.setText("0");
                }
                if(posible==0){

                    boton5.setText("1");
                }
                scoretotal= String.valueOf(scoreparcial);
                score.setText(scoretotal);
                verificar();
            }
        });
    }
    public void presiono5(View view){
        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intento=boton4.getText().toString();
                intento2=boton6.getText().toString();
                posible=Integer.parseInt(intento);
                if(posible==1){
                    scoreparcial=scoreparcial+1;
                    boton4.setText("0");
                }
                if(posible==0)
                {
                    scoreparcial=scoreparcial+1;
                    boton4.setText("1");
                }
                posible=Integer.parseInt(intento2);
                if(posible==1){

                    boton6.setText("0");
                }
                if(posible==0){

                    boton6.setText("1");
                }
                scoretotal= String.valueOf(scoreparcial);
                score.setText(scoretotal);
                verificar();
            }
        });

    }
    public void presiono6(View view){
        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                intento=boton5.getText().toString();
                posible=Integer.parseInt(intento);
                if(posible==1)
                {
                    scoreparcial=scoreparcial+1;
                    boton5.setText("0");
                }
                if(posible==0){
                    scoreparcial=scoreparcial+1;

                    boton5.setText("1");
                }
                scoretotal= String.valueOf(scoreparcial);
                score.setText(scoretotal);
                verificar();
            }
        });
    }
    public void verificar(){
        String b1,b2,b3,b4,b5,b6;
        b1=boton1.getText().toString();
        b2=boton2.getText().toString();
        b3=boton3.getText().toString();
        b4=boton4.getText().toString();
        b5=boton5.getText().toString();
        b6=boton6.getText().toString();
        int btn1,btn2,btn3,btn4,btn5,btn6;
        btn1=Integer.parseInt(b1);
        btn2=Integer.parseInt(b2);
        btn3=Integer.parseInt(b3);
        btn4=Integer.parseInt(b4);
        btn5=Integer.parseInt(b5);
        btn6=Integer.parseInt(b6);
        if(btn1==1&&btn2==1&&btn3==1&&btn4==1&&btn5==1&&btn6==1){
            Mensaje.setText("Pasaste el nivel");
        }
    }
    }
