package com.dell.logindemo;

import android.util.Log;

public class LoginPresenter {
    LoginInterface loginInterface;

    public LoginPresenter(LoginInterface loginInterface){
        this.loginInterface = loginInterface;
    }


    public void login(String un, String pw){
        if(un.equals("admin") && pw.equals("123")){
            loginInterface.loginSuccess("Login successfully!!!");
            return;
        }
        loginInterface.loginFailed("Login failed");
    }
}
