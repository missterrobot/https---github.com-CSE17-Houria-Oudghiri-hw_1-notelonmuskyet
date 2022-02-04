public class Movie extends Media{
    private int duration;

    public Movie(){
        super();
        duration = 0;
    }

    public Movie (String title, String genre, String rating, int duration){
        super(title, genre, rating);
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    public void setDuration(int d){
        duration = d;
    }

    public String toString(){
        return String.format("%sDuration: %d\n", super.toString(), duration);
    }
}
