public class NextMain {
    public static void main(String[] args) {
        Movie movie =Movie.getMovie("A","jaws");
        movie.watchMovie();
        Adventure jaws=(Adventure) Movie.getMovie("a","jaws");
        jaws.watchMovie();
        Object comedy=Movie.getMovie("C","Airplane");
        Comedy theComedy=(Comedy) comedy;
        theComedy.watchComedy();
        var Airplane=Movie.getMovie("C","fdg");
        Airplane.watchMovie();
        Object unknown=Movie.getMovie("S","Aero");
        if (unknown.getClass().getSimpleName()=="Comedy"){
            Comedy c=(Comedy) unknown;
            c.watchComedy();
        } else if (unknown instanceof Adventure  ) {
            ((Adventure)unknown).watchAdventure();
            
        } else if (unknown instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();

        }

    }
}
