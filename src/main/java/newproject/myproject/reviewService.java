package newproject.myproject;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


@Service
public class reviewService {

    @Autowired
    private reviewRepository reviewRepository;

    public review createReview(String reviewBody, String imdbId) {
        review review = reviewRepository.insert(new review(reviewBody, LocalDateTime.now(), LocalDateTime.now()));
     
        return review;
    }

    public List<review> getAllReviews() {
        return reviewRepository.findAll();
    }
}