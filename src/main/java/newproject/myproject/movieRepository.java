package newproject.myproject;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface movieRepository extends MongoRepository<movie, ObjectId>{

    Optional<movie>findMovieByImdbId(String imdbId);
    
}


