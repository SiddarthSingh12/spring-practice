package com.loosecoupling;

public class NewDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "new DB in ACTION";
    }
}
