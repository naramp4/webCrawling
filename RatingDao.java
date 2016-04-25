package WebCrawling;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by sw on 2016. 4. 20..
 */
public class RatingDao{

    private ConnectionMaker connectionMaker;

    public RatingDao(ConnectionMaker connectionMaker){
        this.connectionMaker = connectionMaker;
    }

    public void add(Rating rating) throws ClassNotFoundException, SQLException, IOException {
        Connection c = connectionMaker.makerConnection();


//        PreparedStatement reset = c.prepareStatement("TRUNCATE webcrawling");
//        reset.executeUpdate();
//        reset.close();

        PreparedStatement ps = c.prepareStatement("insert into webcrawling(broad_date,rank,broad,program,rating) values(?,?,?,?,?)");
        ps.setInt(1, rating.getDate());
        ps.setInt(2, rating.getRank());
        ps.setString(3, rating.getBroad());
        ps.setString(4, rating.getProgram());
        ps.setFloat(5, rating.getRating());

        ps.executeUpdate();

        ps.close();
        c.close();
    }

    public Rating get(int date , int colNum) throws ClassNotFoundException, SQLException {

        Connection c = connectionMaker.makerConnection();

        PreparedStatement ps = c.prepareStatement("select * from webcrawling where broad_date=? and rank=?");
        ps.setInt(1, date);
        ps.setInt(2, colNum);

        ResultSet rs = ps.executeQuery();
        rs.next();

        Rating rating = new Rating();
        rating.setDate(rs.getInt("broad_date"));
        rating.setRank(rs.getInt("rank"));
        rating.setBroad(rs.getString("broad"));
        rating.setProgram(rs.getString("program"));
        rating.setRating(rs.getFloat("rating"));

        rs.close();
        ps.close();
        c.close();

        return rating;
    }

}
