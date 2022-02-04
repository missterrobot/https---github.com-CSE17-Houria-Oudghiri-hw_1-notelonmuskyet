public class Media{
    private String title;
    private String genre;
    private String rating;

    public Media(){
        title = "none";
        genre = "none";
        rating = "none";
    }

    public Media(String title, String genre, String rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public String getRating(){
        return rating;
    }

    public void setRating(String rating){
        this.rating = rating;
    }

    public String toString(){
        String out;
        out = String.format("Title: %s\nGenre: %s\nRating: %s\n", title, genre, rating);
        return out;
    }
}