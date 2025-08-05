package com.example.segundaapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText usernameInput;
    private TextInputEditText passwordInput;
    private TextInputLayout usernameLayout;
    private TextInputLayout passwordLayout;
    private MaterialButton loginButton;
    private TextView registerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        initializeViews();
        setupListeners();
    }

    private void initializeViews() {
        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        usernameLayout = findViewById(R.id.usernameLayout);
        passwordLayout = findViewById(R.id.passwordLayout);
        loginButton = findViewById(R.id.loginButton);
        registerText = findViewById(R.id.registerText);
    }

    private void setupListeners() {
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performLogin();
            }
        });
        usernameInput.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    usernameLayout.setError(null);
                }
            }
        });

        passwordInput.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    passwordLayout.setError(null);
                }
            }
        });
        registerText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SplashActivity.class);
                startActivity(intent);
            }
        });
    }

    private void performLogin() {
        String username = usernameInput.getText().toString().trim();
        String password = passwordInput.getText().toString().trim();
        if (TextUtils.isEmpty(username)) {
            usernameLayout.setError("El nombre de usuario es requerido");
            usernameInput.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            passwordLayout.setError("La contraseña es requerida");
            passwordInput.requestFocus();
            return;
        }

        if (password.length() < 6) {
            passwordLayout.setError("La contraseña debe tener al menos 6 caracteres");
            passwordInput.requestFocus();
            return;
        }
        loginButton.setEnabled(false);
        loginButton.setText("INGRESANDO...");
        loginButton.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (validateCredentials(username, password)) {
                    Toast.makeText(MainActivity.this, 
                        "¡Bienvenido, " + username + "!", 
                        Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, 
                        "Usuario o contraseña incorrectos", 
                        Toast.LENGTH_LONG).show();
                }
                loginButton.setEnabled(true);
                loginButton.setText("INGRESAR");
            }
        }, 2000);
    }

    private boolean validateCredentials(String username, String password) {
        return username.equals("admin") && password.equals("123456");
    }
}