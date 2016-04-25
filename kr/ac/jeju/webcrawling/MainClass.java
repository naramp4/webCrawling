package WebCrawling.kr.ac.jeju.webcrawling;

import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by sw on 2016. 4. 20..
 */
public class MainClass {
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException, InterruptedException {
        Rank rank = new Rank();
        Broad broad = new Broad();
        Program program = new Program();
        Date date = new Date();
        RatingNum ratingNum = new RatingNum();
        RatingDao dao = new RatingDao(new ConnectionMaker());
        Rating[] ratings = new Rating[20];


        for (int i = 0; i < 20; i++) {
            ratings[i] = new Rating(date.getDate(), rank.getRank()[i], broad.getBroad()[i], program.getProgram()[i], ratingNum.getRating()[i]);
            System.out.println(i+1 + "번째 컬럼 등록 요청");
            dao.add(ratings[i]);
        }
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < 20; i++) {
            System.out.println(i+1 + "번째 조회 성공");
            ratings[i]=dao.get(20160423, i+1);
            System.out.println(ratings[i]);


        }

    }

}
