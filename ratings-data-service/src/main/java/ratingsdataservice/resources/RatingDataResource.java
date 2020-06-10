package ratingsdataservice.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ratingsdataservice.models.Rating;
import ratingsdataservice.models.UserRating;

/**
 * Create rating data service API
 *
 */
@RestController
@RequestMapping("/ratingsdata")
public class RatingDataResource {
   
	/**
     * Get rating for using movieId
     * @param movieId
     * @return Rating
     */
    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId){
        return new Rating(movieId,4);
    }
    
    /**
     * Get user rating for using userId
     * @param userId
     * @return userRating
     */
    @RequestMapping("users/{userId}")
    public UserRating getUserRating(@PathVariable("userId") String userId){
    	 
    	 Rating ratingInfo = new Rating();
         ratingInfo.setMovieId("1234");
         ratingInfo.setRating(4);
      
         List<Rating> ratings = new ArrayList<Rating>();
         ratings.add(ratingInfo);

         UserRating userRating = new UserRating();
         userRating.setUserRating(ratings);
         return userRating;
         

    }

}
