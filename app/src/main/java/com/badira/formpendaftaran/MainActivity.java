package com.badira.formpendaftaran;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.ActionMenuItemView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputEmail, inputPassword, inputUsername;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEmail      = findViewById(R.id.inputEmail);
        inputPassword   = findViewById(R.id.inputPassword);
        inputUsername   = findViewById(R.id.inputUsername);
        btnDaftar       = findViewById(R.id.btnDaftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //aksi ketika btnDaftar di-klik
                String inputEmailkey = inputEmail.getText().toString();
                String inputPasswordkey = inputPassword.getText().toString();
                String inputUsernamekey = inputUsername.getText().toString();
                if (inputEmailkey.equals("mariqatillah2000@gmail.com")&& inputPasswordkey.equals("ariq2000an")&& inputUsernamekey.equals("Ariq2000")){
                    Toast.makeText(getApplicationContext(), "pendaftaran sukses", Toast.LENGTH_SHORT);
                    Intent intent = new Intent(MainActivity.this, LoginActivity2.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }
            }
        });
    }
}