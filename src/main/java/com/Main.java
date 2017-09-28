package com;


import org.json.simple.JSONObject;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ruslan on 18.08.16.
 */
public class Main {


    public static void main(String[] args) throws MalformedURLException {

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("qweqwe", "xzczxc");

        RestSender restSender = new RestSender(new URL("https://mysite.com"), "login123", "pass123");
        restSender.send(jsonObject);
    }


}
