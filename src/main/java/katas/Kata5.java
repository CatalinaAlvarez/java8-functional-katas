package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.BoxArt;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();
/*
        return movies.stream().map(movie -> movie.getRating())
                .reduce(0.0, (acumular, rating) -> acumular > rating ? acumular : rating);
        return 4.0;
*/

        return movies.stream()
                .reduce((acumular, rating) -> acumular.getRating() > rating.getRating() ? acumular : rating)
                .get()
                .getRating();
    }
}