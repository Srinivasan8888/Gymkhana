package com.example.gymkhana;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;

public class loginactivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);

        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser() != null){
            finish();
            return;
        }


        Button Loginbtnlo = findViewById(R.id.Loginbtnlo);
        Loginbtnlo.setOnClickListener(view -> authenticationUser());

        Button registerbtnlo = findViewById(R.id.registerbtnlo);
        registerbtnlo.setOnClickListener(view -> switchToRegister());

        Button mabutton = findViewById(R.id.mabutton);
        mabutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loginactivity.this, MainActivity.class));
            }
        });
    }

    private void authenticationUser() {
        EditText Emaillogin = findViewById(R.id.Emaillogin);
        EditText passwordlogin = findViewById(R.id.passwordlogin);

        String email = Emaillogin.getText().toString();
        String password = passwordlogin.getText().toString();

        if (email.isEmpty() || password.isEmpty() ){
            Toast.makeText(this, "Enter all the fields is mandatory", Toast.LENGTH_SHORT).show();
            return;
        }

        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        showMainActivity();
                    } else {
                        Toast.makeText(loginactivity.this, "Authentication failed.",
                                Toast.LENGTH_LONG).show();
                    }
                });
    }

    private void showMainActivity() {
    Intent intent = new Intent(this, MainActivity.class);
    startActivity(intent);
    finish();
    }


    private void switchToRegister() {
    Intent intent = new Intent(this, registeractivity.class);
    startActivity(intent);
    finish();
    }
}