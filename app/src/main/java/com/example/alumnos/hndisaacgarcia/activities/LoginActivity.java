package com.example.alumnos.hndisaacgarcia.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import com.example.alumnos.hndisaacgarcia.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText nombreUsuario, password;
    private Button btnEntrar, btnRegistro;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nombreUsuario = (EditText) findViewById(R.id.nombreUsuario);
        password = (EditText) findViewById(R.id.password);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnRegistro = (Button) findViewById(R.id.btnRegistro);


        btnEntrar.setOnClickListener(this);
        btnRegistro.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        switch(view.getId()) {

            case R.id.btnEntrar:
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            break;
            case R.id.btnRegistro:
                Intent intent2 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent2);
                break;

        }

    }

}
