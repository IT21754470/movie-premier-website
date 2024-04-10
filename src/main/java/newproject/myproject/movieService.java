
package newproject.myproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class movieService{


@Autowired
    private movieRepository movieRepository;

    public  List<movie> AllMovies(){

        return movieRepository.findAll();


    }


    public Optional<movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
     





}