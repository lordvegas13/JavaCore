package Lesson6;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.net.*;
import java.util.List;
import java.util.Map;

public class HttpExample {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://gb.ru");                             // * указываем путь до сайтца
        URLConnection urlConnection = url.openConnection();                  // * устанавливаем соединение с сайтом по протоколу url

        HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;

        System.out.println(httpURLConnection.getResponseCode());
        System.out.println(httpURLConnection.getResponseMessage());

        Map<String, List<String>> headers = httpURLConnection.getHeaderFields();
        for (String k: headers.keySet()) {
            System.out.println("Ключ: " + k + ". Значение: "+ headers.get(k));
        }



        // * OkHttpClient - 3 этапа *//
        OkHttpClient okHttpClient = new OkHttpClient();                //* 1 этап - создать обьект

        Request request = new Request.Builder()                        //* 2 этап - создать запрос
                .url("https://gb.ru")
                .build();

        Response response = okHttpClient.newCall(request).execute();   //* 3 этап - выполняем

        System.out.println(request.headers());
        System.out.println(request.body().string());


    }
}
