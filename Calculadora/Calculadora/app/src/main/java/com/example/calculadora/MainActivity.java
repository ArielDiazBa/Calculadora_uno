package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText etCalname;
    private EditText etCalpassword;
    private Button btCalboton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();
    }
    private void setContentView(){
        etCalname = findViewById(R.id.txtnombre);
        etCalpassword = findViewById(R.id.txtcontraseña);
        btCalboton = findViewById(R.id.btnentrar);
        btCalboton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnentrar){
            SendLogin();
    }
}

    private void SendLogin() {
        if (etCalname.getText().toString().equalsIgnoreCase("ariel") && etCalpassword.getText().toString().equalsIgnoreCase("1234")) {
            Intent calculatorIntent = new Intent(this, calculadora_operar.class);
            startActivity(calculatorIntent);
        }
    }
    }


