package com.sadikkuzu.examples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SKmba {
    public static void main(String[] args) {
        String blogUrl = "https://yenibirlider.org/etkinlikler/";
        String cssq = ".vc_custom_1510727446671 > div > div > div > div > div > div > div.content > h6 > a";
        //cssq = ".vc_custom_1510727446671 > h6 > a";
        Document doc = null;
        try {
            doc = Jsoup.connect(blogUrl).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(doc.select(".vc_custom_1510727446671 a"));
        for (Element lnk : doc.select(cssq))
        {
            System.out.println(lnk.attr("href"));
        }
    }
}
