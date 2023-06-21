package com.unical.nerdfy.business;

import java.util.ArrayList;
import java.util.List;



public class Autenticazione {
    private String username;
    private String password;
    public Autenticazione() {}
    public Autenticazione(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public Boolean autentica(String u, String p){
        if (u.equals(username) && p.equals(password)){
            return true;
        }
        else
            return false;
    }


    public boolean validaPassword(String password){
        if (!password.matches("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9\\s]).{6,}")){
            return false;
        }
        else{
            return true;
        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
