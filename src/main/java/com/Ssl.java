package com;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ruslan on 06.02.2017.
 */
public class Ssl {



    public static SSLContext getSSLContext()  {
        SSLContext sslContext = null;
        try {
            sslContext = SSLContext.getInstance("SSL");
            X509TrustManagerImpls x509TrustManagerImpls = new X509TrustManagerImpls();
            sslContext.init(null, new TrustManager[]{x509TrustManagerImpls}, null);
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            e.printStackTrace();
        }
        return sslContext;
    }


}