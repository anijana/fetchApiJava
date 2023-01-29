package org.fetchAPIData;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class fetchApiData2 {
    public static void main(String[] args) throws Exception{
        var url = "https://api.weatherbit.io/v2.0/forecast/daily?city=Kolkata,IN&key=87d02fefa318417e8cf2211343d1998a";

        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client = HttpClient.newBuilder().build();

        var res = client.send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(res.statusCode());
        System.out.println(res.body());
    }
}
