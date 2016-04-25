package WebCrawling;

import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sw on 2016. 4. 20..
 */
public class Date {


    public int getDate() throws IOException {


        ElementsClass getEle = new ElementsClass();
        Elements ele = getEle.getElements(".ranking_date");

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < ele.size(); i++) {
            sb.append(ele.get(i)).append(" ");
        }

        Pattern p = Pattern.compile("[0-2]+[0-9]");
        Matcher m = p.matcher(sb);
        sb = null;
        sb = new StringBuffer();
        while (m.find()) {
            sb.append(m.group());
        }

        int date = Integer.parseInt(sb.toString());

        return date;
    }

}
