package java.by.step.amakids.tests.api_test_example;

import org.apache.hc.core5.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APITestExample extends BaseRestAPIClass{

    @Test
    public void verifySuccessStatusCode() throws Exception {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()

                .uri(URI.create("https://www.postman-echo.com/get"))
                .headers()
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request,HttpResponse.BodyHandlers.ofString());

        Assertions.assertEquals(HttpStatus.SC_OK, response.statusCode());
    }
}
