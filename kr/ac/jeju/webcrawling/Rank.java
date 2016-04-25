package WebCrawling.kr.ac.jeju.webcrawling;

import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sw on 2016. 4. 20..
 */
public class Rank {


    public int[] getRank() throws IOException {

        ElementsClass getEle = new ElementsClass();
        Elements ele = getEle.getElements(".tb_txt_center");

        ArrayList al= new ArrayList<StringBuffer>();
        StringBuffer sb = new StringBuffer();
        int[] rank = new int[20];



        int num = -2;
        for (int i = 0; i < ele.size() / 2; i++) {
            num += 2;
            sb.append(ele.get(num)).append(" ");
        }



        Pattern p = Pattern.compile("[0-9]{1,2}");
        Matcher m = p.matcher(sb);
        while (m.find()) {
            al.add(m.group());
        }

        for(int i = 0 ; i < al.size() ; i++){
           rank[i]= Integer.parseInt((String)al.get(i));
        }

        return rank;
    }


}
