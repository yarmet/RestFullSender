package rulan.main;

//
//import com.sun.jersey.api.client.ClientResponse;
//import org.json.simple.JSONObject;
//import rulan.restsender.RestSender;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//
///**
// * Created by ruslan on 18.08.16.
// */
//public class Main {
//
//
//    public static void main(String[] args) throws MalformedURLException {
//
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("qweqwe", "xzczxc");
//
//        RestSender restSender = new RestSender(new URL("https://mysite.com"), "login123", "pass123");
//
//        ClientResponse response = restSender.send(jsonObject);
//
//        System.out.println("status : "+response.getStatus() + "  message : " + response.getEntity(String.class));
//    }
//
//
//}
