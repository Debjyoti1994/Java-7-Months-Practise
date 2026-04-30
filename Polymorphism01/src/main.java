import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Movie theMovie=Movie.getMovie("Science","Star wars");
//        theMovie.watchMovie();
//        Movie theMovie2=new Comedy("Charlies Angles");
//        theMovie2.watchMovie();
//        Movie theMovie3=new Adventure("Captain America");
//        theMovie3.watchMovie();

        Scanner s=new Scanner(System.in);
        while (true){
            System.out.println("Enter type (A for Adventure,C for comedy" +
                    " S for ScienceFiction):");
            String type=s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter title :");
            String title=s.nextLine();
            Movie movie =Movie.getMovie(type,title);
            movie.watchMovie();


        }
           }
}
