package com.loosecoupling;

public class WebServiceDataProvider implements UserDataProvider{
    @Override
    public String getUserDetails(){
        return "fetching data from webservice";
    }
}
