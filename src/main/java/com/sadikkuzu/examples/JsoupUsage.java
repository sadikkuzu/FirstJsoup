package com.sadikkuzu.examples;

import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupUsage {

    public static void main(String[] args) {
        List<Broadcast> broadcastList = new ArrayList<Broadcast>();
        try {
            Document document = Jsoup.connect("https://www.kanald.com.tr/yayin-akisi").get();
            Elements broadcasts = document.select("#day-090519 tr");
            for (Element element : broadcasts) {
                Broadcast broadcast = new Broadcast();
                broadcast.setTime(element.getElementsByClass("time").text());
                broadcast.setTitle(element.getElementsByClass("title").text());
                broadcast.setImageUrl(element.getElementsByTag("img").attr("data-src"));
                broadcast.setTag(element.getElementsByClass("tag").text());

                broadcastList.add(broadcast);
            }

            for (Broadcast broadcast : broadcastList) {
                System.out.println(broadcast.getTime());
                System.out.println(broadcast.getTitle());
                System.out.println(broadcast.getImageUrl());
                System.out.println(broadcast.getTag());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}