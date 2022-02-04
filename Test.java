import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Media[] mediaList = new Media[10];
        mediaList[0] = new Show("Archive81","Sci-Fi","TV-MA",1);
        mediaList[1] = new Show("After Life","Drama","TV-MA",3);
        mediaList[2] = new Movie("After We Fell","Drama","R",98);
        mediaList[3] = new Show("The Witcher","Drama","TV_MA",2);
        mediaList[4] = new Movie("Dont Look Up","Drama","R",138);
        mediaList[5] = new Movie("The Alpinist","Documentary","PG-13",92);
        mediaList[6] = new Movie("Miss Sloane","Drama","R",131);
        mediaList[7] = new Show("Arcane","Animation","TV-14",1);
        mediaList[8] = new Movie("The Girl With The Dragon Tattoo","Drama","R",158);
        mediaList[9] = new Show("Arrested Development","Comedy","TV-MA",5);
        int input = 0;
        String userGenre;
        while(input != 5){
            System.out.println("List All Media: 0\nView Movies: 1\nView Shows: 2\nFind Genre: 3\nSort: 4\nExit: 5");
            input = scan.nextInt();
            // /System.out.println(input);
            if(input==0 || input==1 || input == 2){
                printMedia(mediaList, input);
            }
            else if(input==3){
                System.out.println("Enter a genre: Sci-Fi, Drama, Documentary, Comedy, or Animation");
                userGenre = scan.next();
                findGenre(mediaList, userGenre);
            }
            else if(input==4){
                sortRating(mediaList);
            }
            else if(input == 5){
                scan.close();
                System.out.println("Exiting Program... Thank You!");
            }
            else{
                System.out.println("Sorry unrecognized command, please try something else");
            }
        }
    }

    public static void printMedia(Media[] list, int type){
        //Prints all Media
        if(type == 0){
            for(int i = 0; i<list.length; i++){
                System.out.println(list[i].toString());
            }
        }

        //prints only movies
        else if(type == 1){
            for(int i = 0; i<list.length; i++){
                if(list[i].getClass() == Movie.class){
                System.out.println(list[i].toString());
                }
            }
        }

        //prints only shows
        else if(type == 2){
            for(int i = 0; i<list.length; i++){
                if(list[i].getClass() == Show.class){
                    System.out.println(list[i].toString());
                    }
            }
        }
    }

    //Prints list of media with specified genre, as well as the list length. If none are found print a message accordingly
    public static int findGenre(Media[] list, String genre){
        int counter = 0;
        for(int i = 0; i<list.length;i++){
            // /System.out.println(list[i].getGenre() + " " + genre);
            if(list[i].getGenre().equals(genre)){
                System.out.println(list[i].toString());
                counter++;
            }
        }
        if(counter !=0){
            System.out.println(counter + " matches found for your genre: " + genre);
        }
        else{
            System.out.println("Sorry we couldnt find any matched for '"+genre+"'.");
        }
        return counter;
        
    }

    //sorts media in order according to the string "rating"
    public static void sortRating(Media[] list){
        for (int i=0; i<list.length; i++) {
            //Insert element i in the sorted sub-list
            Media temp;
            for(int j = i+1; j<list.length;j++){
                if(list[i].getRating().compareToIgnoreCase(list[j].getRating())>0){
                    temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
         }
       printMedia(list, 0);
    }
}
