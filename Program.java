package WebCrawling;

import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sw on 2016. 4. 20..
 */
public class Program{


    public String[] getProgram() throws IOException {

        ElementsClass getEle = new ElementsClass();
        Elements ele = getEle.getElements(".tb_txt");

        ArrayList al = new ArrayList<StringBuffer>();
        StringBuffer sb = new StringBuffer();

        String[] st = new String[20];

        for (int i = 0; i < ele.size(); i++) {
            sb.append(ele.get(i)).append(" ");

        }

        Pattern p = Pattern.compile("[A-Z0-9가-힣]{1,20}\\({0,1}[A-Z가-힣]{1,20}\\){0,1}");
        Matcher m = p.matcher(sb);

        while (m.find()) {
            al.add(m.group());
        }
        for(int i=0; i<al.size();i++){
            st[i] = (String)al.get(i);
        }
        return st;
    }


}
