package java.by.step.amakids.tests.api_test_example;

import java.net.URI;
import java.net.http.HttpRequest;

public interface HttpRequestBuilder {

    default HttpRequest getRequest (String url, HttpMethod method, HttpRequest.BodyPublisher body) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .method(method.toString(), body)
                .build();
        return request;
    }
}
