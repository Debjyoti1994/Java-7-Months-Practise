import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//    Movie movie=Movie.getMovie("Science","Star Wars");
//    movie.watchMovie();
    Scanner s=new Scanner(System.in);
    while (true)
    {
        System.out.println("Enter type( A for adventure ,C for comedy,S For science fiction,Q to exit");
        String type=s.nextLine();
        if ("Qq".contains(type)){
            break;
        }
        System.out.println("Ente title :");
        String title=s.nextLine();
        Movie movie=Movie.getMovie(type,title);
        movie.watchMovie();

    }
    }
}
