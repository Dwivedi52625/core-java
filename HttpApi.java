import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;

public class HttpApi {
    public static void main(String[] args) {
        String uri="https://httpbin.org/get";
        HttpRequest req= HttpRequest.newBuilder().uri(URI.create(uri)).headers("key1","value1","key2","value2").GET().build();
        HttpClient client = HttpClient.newBuilder().build();
        try {
            HttpResponse<String> resp = client.send(req, BodyHandler.ofString());
            System.out.println(resp.statusCode());
            System.out.println(resp.body());
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
