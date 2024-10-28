package aims;

public class Review {
    private int reviewID;
    private DVD dvd;
    private int rating;
    private String comment;
    private String response;

    public Review(int reviewID, DVD dvd, int rating, String comment) {
        this.reviewID = reviewID;
        this.dvd = dvd;
        this.rating = rating;
        this.comment = comment;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    // Getters and Setters
    public int getReviewID() { return reviewID; }
    public DVD getDvd() { return dvd; }
    public int getRating() { return rating; }
    public String getComment() { return comment; }
    public String getResponse() { return response; }
}
