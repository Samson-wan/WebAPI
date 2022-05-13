public class Movie {

    private String title;
    private int id;
    private String posterPath;
    private double vote_average;
    private String release_date;
    private int vote_count;

    public Movie(String title, int id, String posterPath, double vote_average, String release_date, int vote_count)
    {
        this.title = title;
        this.id = id;
        this.posterPath = posterPath;
        this.vote_average = vote_average;
        this.release_date = release_date;
        this.vote_count = vote_count;
    }

    public String getTitle()
    {
        return title;
    }

    public int getID()
    {
        return id;
    }

    public String getPosterPath()
    {
        return posterPath;
    }

    public double getVote_average() {
        return vote_average;
    }

    public String getRelease_date() {
        return release_date;
    }

    public int getVote_count() {
        return vote_count;
    }
}