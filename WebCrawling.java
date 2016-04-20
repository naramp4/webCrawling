package WebCrawling;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class WebCrawling {
    public static void main(String args[]) throws IOException {
        String link = "http://www.nielsenkorea.co.kr/tv_terrestrial_day.asp?menu=Tit_1&sub_menu=1_1&area=00";
        Document doc = Jsoup.connect(link).get();
        Elements programName = doc.select("td.tb_txt");
        Elements rankB = doc.select(".tb_txt_center");

        for (int i = 0; i < rankB.size(); i += 2) {
            System.out.println(rankB.get(i));
        }
    }
}