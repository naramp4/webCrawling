package WebCrawling.kr.ac.jeju.webcrawling;

import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sw on 2016. 4. 20..
 */
public class RatingNum {


    public Float[] getRating() throws IOException {

        ElementsClass getEle = new ElementsClass();
        Elements ele = getEle.getElements(".percent");
        Elements ele2 = getEle.getElements(".percent_g");

        ArrayList al = new ArrayList<StringBuffer>();
        StringBuffer sb = new StringBuffer();
        Float[] floats = new Float[20];

        for (int i = 0; i < ele.size(); i++) {
            sb.append(ele.get(i)).append(" ");
        }

        for (int i = 0; i < ele2.size(); i++) {
            sb.append(ele2.get(i)).append(" ");
        }


        Pattern p = Pattern.compile("[0-9]{1,2}.[0-9]");
        Matcher m = p.matcher(sb);
        while (m.find()) {
            al.add(m.group());
        }

        for(int i=0; i<al.size();i++){
            floats[i] = Float.parseFloat((String)al.get(i));
        }


        return floats;
    }


}
