package rulan.restsender;

import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * Created by ruslan on 18.08.16.
 */

public class X509TrustManagerImpls implements X509TrustManager {


    public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
    }


    public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
        x509Certificates[0].checkValidity();
        x509Certificates[0].getIssuerUniqueID();
        x509Certificates[0].getSubjectDN();
    }


    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
