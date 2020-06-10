package movieinfoservice.resources;

import movieinfoservice.models.Movie;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create Movie info service API
 *
 */
@RestController
@RequestMapping("/movies")
public class MovieResource {
    
	/**
     * Get movie info for using movieId
     * @param movieId
     * @return Movie
     */
    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId){
        return new Movie(movieId,"TestName");
    }
}
