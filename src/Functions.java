import java.util.ArrayList;
import java.util.List;

public class Functions {
    List <Movies> listMovies = new ArrayList<>();
    List <Series> listSeries = new ArrayList<>();
    List <Mangas> listMangas = new ArrayList<>();

    public List<Movies> getListMovies() {
        return listMovies;
    }

    public List<Series> getListSeries() {
        return listSeries;
    }

    public List<Mangas> getListMangas() {
        return listMangas;
    }

    //mv
    public void addMovies(String name){
        Movies mv = new Movies();
        mv.name = name;
        listMovies.add(mv);
    }

    public void removeMovies(String name){
        for (int i = 0; i < listMovies.size(); i++) {
            if(listMovies.get(i).name.equals(name)){
                listMovies.remove(i);
                i--;
            }
        }
    }

    //sr
    public void addSeries(String name){
        Series sr = new Series();
        sr.name = name;
        listSeries.add(sr);
    }

    public void removeSeries(String name){
        for (int i = 0; i < listSeries.size(); i++) {
            if(listSeries.get(i).name.equals(name)){
                listSeries.remove(i);
                i--;
            }
        }
    }

    //mg
    public void addMangas(String name){
        Mangas mg = new Mangas();
        mg.name = name;
        listMangas.add(mg);
    }

    public void removeMangas(String name){
        for (int i = 0; i < listMangas.size(); i++) {
            if(listMangas.get(i).name.equals(name)){
                listMangas.remove(i);
                i--;
            }
        }
    }
}
