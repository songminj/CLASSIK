package com.ssafy.a604;

import com.ssafy.a604.crawling.CrawlingClassic;
import com.ssafy.a604.crawling.CrawlingComposer;

public class Main {

    public static void main(String[] args) {
        new CrawlingClassic().startCrawling();
        new CrawlingComposer().startCrawling();
    }

}