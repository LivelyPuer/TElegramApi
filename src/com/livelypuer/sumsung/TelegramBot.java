package com.livelypuer.sumsung;


public class TelegramBot {
    private String token;
    private String url = "https://api.telegram.org/bot";

    public TelegramBot(String token){
        url += token;
        System.out.println(getPing());

    }
    public String getPing(){
        return Request.getRequest(url + "/getMe");
//
//        var res = UrlFetchApp.fetch(telegramUrl+"/getUpdates").getContentText();
//        var res = JSON.parse(res);
//        Logger.log(res.result[0].message.chat.id.toString());
        }
    }
