package com.loosecoupling;

public class UserDatabaseProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "User Details";
    }
}
