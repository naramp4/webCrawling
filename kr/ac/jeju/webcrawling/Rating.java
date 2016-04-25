package WebCrawling.kr.ac.jeju.webcrawling;

/**
 * Created by sw on 2016. 4. 21..
 */
public class Rating {
    private int date;
    private int rank;
    private String broad;
    private String program;
    private float rating;

    public Rating() {
    }

    public Rating(int date, int rank, String broad, String program, float rating) {
        setDate(date);
        setRank(rank);
        setBroad(broad);
        setProgram(program);
        setRating(rating);
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getBroad() {
        return broad;
    }

    public void setBroad(String broad) {
        this.broad = broad;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rating{");
        sb.append("date=").append(date);
        sb.append(", rank=").append(rank);
        sb.append(", broad='").append(broad).append('\'');
        sb.append(", program='").append(program).append('\'');
        sb.append(", rating=").append(rating);
        sb.append('}');
        return sb.toString();
    }
}
