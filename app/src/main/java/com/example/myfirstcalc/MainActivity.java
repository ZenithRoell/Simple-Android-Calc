package com.example.myfirstcalc;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    double input1 = 0, input2 = 0;

    TextView edit;


    boolean Addition, Subtract, Multiply, Division, decimal;

    Button Button1, Button2, Button3, Button4, Button5, Button6, Button7,
    Button8, Button9, ButtonAdd, ButtonSub, ButtonMul, ButtonEql ,
            ButtonDivide, Button0, ButtonDot;

    ImageButton ButtonDelete;





    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // set content view

        setContentView(R.layout.activity_main);

        Button1 = (Button) findViewById(R.id.btn_one);
        Button2 = (Button) findViewById(R.id.btn_two);
        Button3 = (Button) findViewById(R.id.btn_three);
        Button4 = (Button) findViewById(R.id.btn_four);
        Button5 = (Button) findViewById(R.id.btn_five);
        Button6 = (Button) findViewById(R.id.btn_six);
        Button7 = (Button) findViewById(R.id.btn_seven);
        Button8 = (Button) findViewById(R.id.btn_eight);
        Button9 = (Button) findViewById(R.id.btn_nine);
        ButtonAdd = (Button) findViewById(R.id.btn_add);
        ButtonSub  = (Button) findViewById(R.id.btn_sub);
        ButtonMul = (Button) findViewById(R.id.btn_multiply);
        ButtonDivide = (Button) findViewById(R.id.btn_divide);
        Button0 = (Button) findViewById(R.id.btn_zero);
        ButtonDelete = (ImageButton) findViewById(R.id.img_btn_delete);
        ButtonDot = (Button) findViewById(R.id.btn_dot);
        ButtonEql = (Button) findViewById(R.id.btn_eql);



        edit = (TextView) findViewById(R.id.TextView);


        Button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "1");
            }
        });



        Button2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "2");
            }
        });


        Button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "3");
            }
        });

        Button4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "4");
            }
        });


        Button5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "5");
            }
        });


        Button6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "6");
            }
        });


        Button7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "7");
            }
        });


        Button8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "8");
            }
        });


        Button9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "9");
            }
        });

        Button0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(edit.getText() + "0");
            }
        });


        ///


        ButtonAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

               if(edit == null){
                   edit.setText(" ");
               }else
                   {
                  input1 =  Float.parseFloat(edit.getText() + " ");
                   Addition = true;
                   decimal = false;
                   edit.setText(null);

               }
            }
        });


        ButtonSub.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if(edit == null){
                    edit.setText(" ");
                }else
                {
                    input1 =  Float.parseFloat(edit.getText() + " ");
                    Subtract = true;
                    decimal = false;
                    edit.setText(null);

                }
            }
        });

        ButtonMul.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if (edit == null) {
                    edit.setText(" ");
                } else {
                    input1 = Float.parseFloat(edit.getText() + " ");
                    Multiply = true;
                    edit.setText(null);

                }
            }
        });


        ButtonDivide.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                if (edit == null) {
                    edit.setText(" ");
                } else {
                    input1 = Float.parseFloat(edit.getText() + " ");
                    Division = true;
                    decimal = false;
                    edit.setText(null);

                }
            }
        });







        ButtonEql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Addition || Subtract || Multiply || Division) {
                    input2 = Float.parseFloat(edit.getText() + " ");
                }

                if(Addition == true){
                    edit.setText(input1 + input2 + " ");
                    Addition = false;
                }


                if(Subtract == true){
                    edit.setText(input1  - input2 + " ");
                    Subtract = false;
                }


                if(Multiply == true){
                    edit.setText(input1 * input2 + " ");
                    Multiply = false;
                }

                 if(Division == true){
                    edit.setText(input1 /input2 + " ");
                    Division = false;
                }


            }
        });


        ButtonDelete.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                edit.setText(" ");
                input1 = 0.0;
                input2 = 0.0;
            }
        });


        ButtonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(decimal){

                }else{
                    edit.setText(edit.getText() + ".");
                    decimal = true;

                }
            }
        });


    }


    @Override
    public void onClick(View v) {

    }
}