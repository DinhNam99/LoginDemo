package com.dell.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements LoginViewInterface {

    EditText edUS, edPW;
    Button btnLogin;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        init();
    }

    public void init(){
        edUS = findViewById(R.id.edUS);
        edPW = findViewById(R.id.edPW);
        btnLogin = findViewById(R.id.btnLogin);
        loginPresenter = new LoginPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUS.getText().toString();
                String password = edPW.getText().toString();
                loginPresenter.login(username,password);
            }
        });
    }
    @Override
    public void loginSuccess(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
}
