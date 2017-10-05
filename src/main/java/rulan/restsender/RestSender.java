package rulan.restsender;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.client.urlconnection.HTTPSProperties;
import org.json.simple.JSONObject;

import java.net.URL;


/**
 * Created by ruslan on 18.08.16.
 */
public class RestSender {

    private Client client;
    private final String HTTPS = "https";
    private final URL url;


    public RestSender(URL url, String login, String pass) {
        this.url = url;

        DefaultClientConfig defaultClientConfig = new DefaultClientConfig();
        defaultClientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

        if (url.getProtocol().equals(HTTPS)) {
            defaultClientConfig.getProperties().put(HTTPSProperties.PROPERTY_HTTPS_PROPERTIES, new HTTPSProperties(null, Ssl.getSSLContext()));
            client = Client.create(defaultClientConfig);
            client.addFilter(new HTTPBasicAuthFilter(login, pass));
        } else {
            client = Client.create(defaultClientConfig);
        }
        client.setReadTimeout(30000);
        client.setConnectTimeout(5000);
    }


    public ClientResponse send(JSONObject jsonObject) {
        return client.resource(url.toString()).type("application/json").post(ClientResponse.class, jsonObject.toString());
    }

}
