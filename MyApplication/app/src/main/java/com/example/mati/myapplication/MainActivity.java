package com.example.mati.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private static final String EXTRA_MESSAGE ="extramessage" ;

    private Button BT1,BT2,BT3, BT4, BT5, BT6, BT7, BT8, BT9, BT0, SUMA, RESTA, MULT, DIVI, POT, RAIZ, RESET, EXIT, igual;
    private TextView CAMPO;
    private String valor1;
    private int contador_suma, contador_resta, contador_multi, contador_divi;
    private double total;


    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //BOTONES NUMERICOS
        BT1=(Button)findViewById(R.id.BT1);
        BT2=(Button)findViewById(R.id.BT2);
        BT3=(Button)findViewById(R.id.BT3);
        BT4=(Button)findViewById(R.id.BT4);
        BT5=(Button)findViewById(R.id.BT5);
        BT6=(Button)findViewById(R.id.BT6);
        BT7=(Button)findViewById(R.id.BT7);
        BT8=(Button)findViewById(R.id.BT8);
        BT9=(Button)findViewById(R.id.BT9);
        BT0=(Button)findViewById(R.id.BT0);

        //OPERACIONES
        SUMA=(Button)findViewById(R.id.SUMA);
        RESTA=(Button)findViewById(R.id.RESTA);
        MULT=(Button)findViewById(R.id.MULT);
        DIVI=(Button)findViewById(R.id.DIVI);
        POT=(Button)findViewById(R.id.POT);
        RAIZ=(Button)findViewById(R.id.RAIZ);

        //ACCIONES
        RESET=(Button)findViewById(R.id.RESET);
        EXIT=(Button)findViewById(R.id.EXIT);

        //texto
        CAMPO=(TextView)findViewById(R.id.CAMPO);
        igual=(Button)findViewById(R.id.igual);

        //PULSAR BOTONES DEL 0 AL 9
        BT1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    CAMPO.setText(CAMPO.getText()+"1");
            }
        });
        BT2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"2");
            }
        });
        BT3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"3");
            }
        });
        BT4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"4");
            }
        });
        BT5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"5");
            }
        });
        BT6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"6");
            }
        });
        BT7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"7");
            }
        });
        BT8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"8");
            }
        });
        BT9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"9");
            }
        });
        BT0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CAMPO.setText(CAMPO.getText()+"0");
            }
        });

        //PULSAR BOTONES OPERACIONES
        /*todos los botones de operaciones hacen lo mismo, vacian
        el campo de texto a una variable auxiliar y suman 1 a su contador particular, enfuncion de que
        contador este a 1 el boton = decidira que hacer
         */

        SUMA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = CAMPO.getText().toString();
                CAMPO.setText(" ");
                contador_suma++;
            }
        });

        RESTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = CAMPO.getText().toString();
                CAMPO.setText(" ");
                contador_resta++;
            }
        });

        MULT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = CAMPO.getText().toString();
                CAMPO.setText(" ");
                contador_multi++;
            }
        });

        DIVI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = CAMPO.getText().toString();
                CAMPO.setText(" ");
                contador_divi++;
            }
        });

        POT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = CAMPO.getText().toString();
                CAMPO.setText(" ");
                double c= Double.parseDouble(String.valueOf(valor1));
                double resultado = c*c;
                CAMPO.setText(Double.toString(resultado));
                ;
            }
        });

        RAIZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valor1 = CAMPO.getText().toString();
                CAMPO.setText(" ");
                double c= Double.parseDouble(String.valueOf(valor1));
                double resultado = Math.sqrt(c);
                CAMPO.setText(Double.toString(resultado));

            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double c;
                if(contador_suma>0){
                    c=Double.parseDouble(String.valueOf(valor1));
                    total=c+Double.parseDouble(String.valueOf(CAMPO.getText()));
                    CAMPO.setText(Double.toString(total));
                    contador_suma=0;

                }
                if(contador_resta>0){
                    c=Double.parseDouble(String.valueOf(valor1));
                    total=c-Double.parseDouble(String.valueOf(CAMPO.getText()));
                    CAMPO.setText(Double.toString(total));
                    contador_resta=0;

                }
                if(contador_multi>0){
                    c=Double.parseDouble(String.valueOf(valor1));
                    total=c*Double.parseDouble(String.valueOf(CAMPO.getText()));
                    CAMPO.setText(Double.toString(total));
                    contador_multi=0;

                }
                if(contador_divi>0){
                    c=Double.parseDouble(String.valueOf(valor1));
                    total=c/Double.parseDouble(String.valueOf(CAMPO.getText()));
                    CAMPO.setText(Double.toString(total));
                    contador_divi=0;

                }

            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
