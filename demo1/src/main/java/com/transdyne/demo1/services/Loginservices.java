package com.transdyne.demo1.services;

import org.springframework.stereotype.Service;

@Service
public class Loginservices {

    public boolean validateUser(String userid, String password) {

        return userid.equalsIgnoreCase("pavan")
                && password.equalsIgnoreCase("abc");
    }
}