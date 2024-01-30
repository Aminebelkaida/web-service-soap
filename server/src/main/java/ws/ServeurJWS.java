package ws;

import jakarta.xml.ws.Endpoint;

public class ServeurJWS {
    public static void main(String[] args) {
        String url="http://0.0.0.0:4444/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service déployé sur l'adresse: "+url);
    }
}
