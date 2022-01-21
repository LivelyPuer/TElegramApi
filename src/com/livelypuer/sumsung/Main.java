package com.livelypuer.sumsung;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;


public class Main {
    private final static String token = "1660388537:AAE5RA0_zG7KBGyKH8FgvfY4uFN6TSwXf8Y"; // Fill this in with your token
    private final String telegramUrl = "https://api.telegram.org/bot" + token;
    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) {
        TelegramBot telegramBot = new TelegramBot(token);

    }

    void getChat_id() throws Exception {
        String url = "http://www.google.com/search?q=mkyong";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // Значение по умолчанию - GET
        con.setRequestMethod("GET");

        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuilder response = new StringBuilder();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        // Распечатываем результат
        System.out.println(response.toString());


//
//        var res = UrlFetchApp.fetch(telegramUrl+"/getUpdates").getContentText();
//        var res = JSON.parse(res);
//        Logger.log(res.result[0].message.chat.id.toString());
    }
}
