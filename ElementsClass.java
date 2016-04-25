package WebCrawling;

import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

import java.io.IOException;

public class ElementsClass {

    public Elements getElements(String ele) throws IOException {
        String link = "http://www.nielsenkorea.co.kr/tv_terrestrial_day.asp?menu=Tit_1&sub_menu=1_1&area=00";
        Document doc = Jsoup.connect(link).get();
        Elements element = doc.select(ele);

        return element;
    }
}