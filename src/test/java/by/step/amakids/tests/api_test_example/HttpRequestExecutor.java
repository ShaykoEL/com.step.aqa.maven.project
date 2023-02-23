package java.by.step.amakids.tests.api_test_example;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface HttpRequestExecutor {

    HttpClient httpClientInitialization();

    default HttpResponse<String> executeRequest (HttpRequest request) {
        HttpResponse<String> response = null;
        try {
            response = httpClientInitialization().send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("Bad request !");
        }

        return response;
    }

}
