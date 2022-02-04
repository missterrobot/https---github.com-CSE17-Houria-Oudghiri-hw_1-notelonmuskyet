public class Show extends Media{
    private int seasons;

    public Show(){
        super();
        seasons = 0;
    }

    public Show(String title, String genre, String rating, int seasons){
        super(title, genre, rating);
        this.seasons = seasons;
    }

    public int getSeasons(){
        return seasons;
    }

    public void setSeasons(int s){
        this.seasons = s;
    }

    public String toString(){
        return String.format("%sSeasons: %d\n", super.toString(), seasons);
    }
}
