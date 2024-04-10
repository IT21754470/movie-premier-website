package newproject.myproject;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/v1/reviews")
public class reviewController {

    @Autowired
    private reviewService service;

    @PostMapping
    public ResponseEntity<review> createReview(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<>(service.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<review>> getAllReviews() {
        List<review> reviews = service.getAllReviews();
        return new ResponseEntity<>(reviews, HttpStatus.OK);
    }
}
