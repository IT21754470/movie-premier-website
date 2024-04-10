package newproject.myproject;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/movies")
public class movieController {

    @Autowired
    private movieService movieService;

    @GetMapping
    public ResponseEntity<List<movie>> getAllMovies() { 
        return new ResponseEntity<List<movie>>(movieService.AllMovies(), HttpStatus.OK);
    }


    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
