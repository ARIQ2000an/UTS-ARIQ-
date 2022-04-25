package com.badira.formpendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity2 extends AppCompatActivity {
    EditText inputUsername, inputPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        inputUsername   = findViewById(R.id.inputUsername);
        inputPassword   = findViewById(R.id.inputPassword);
        btnLogin       = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputUsernamekey = inputUsername.getText().toString();
                String inputPasswordekey = inputPassword.getText().toString();

                if (inputUsernamekey.equals("Ariq2000")&& inputPasswordekey.equals("ariq2000an")){
                    Toast.makeText(getApplicationContext(), "Login sukses", Toast.LENGTH_SHORT);
                    Intent intent = new Intent(MainActivity.this, ProfilActivity2.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
            }
        });
    }
}