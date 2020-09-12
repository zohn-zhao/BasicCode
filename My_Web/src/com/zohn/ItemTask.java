package com.zohn;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.crypto.spec.PSource;
import java.io.IOException;

public class ItemTask {
    public static void main(String[] args) throws IOException {
        Document document = Jsoup.connect("https://hualsy.com/").timeout(0).get();
        document.select()
    }
}
