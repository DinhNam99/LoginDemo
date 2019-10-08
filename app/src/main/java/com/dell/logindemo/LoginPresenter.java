package com.dell.logindemo;

public class LoginPresenter implements LoginPresenterInterface{
    LoginViewInterface loginInterface;

    public LoginPresenter(LoginViewInterface loginInterface){
        this.loginInterface = loginInterface;
    }

    @Override
    public void login(String un, String pw) {
        if(un.equals("admin") && pw.equals("123")){
            loginInterface.loginSuccess("Login successfully!!!");
            return;
        }
        loginInterface.loginFailed("Login failed");
    }
}
