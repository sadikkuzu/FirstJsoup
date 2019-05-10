package com.sadikkuzu.examples;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Mba {
    public static void main(String[] args) {
        String htmlString = "<html><head><title>My title</title></head>"
                + "<body>Body content</body></html>";

        Document doc = Jsoup.parse(htmlString);
        String title = doc.title();
        String body = doc.body().text();

        System.out.printf("Title: %s%n", title);
        System.out.printf("Body: %s", body);
    }
}
