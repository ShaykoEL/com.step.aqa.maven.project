package java.by.step.amakids.tests.api_test_example;

import java.net.http.HttpClient;

public class BaseRestAPIClass implements HttpRequestBuilder, HttpRequestExecutor{

    @Override
    public HttpClient httpClientInitialization() {
        return HttpClient.newHttpClient();
    }
}
