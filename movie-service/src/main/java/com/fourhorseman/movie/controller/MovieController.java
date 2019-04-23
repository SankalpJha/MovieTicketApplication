package com.fourhorseman.movie.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import static com.fourhorseman.movie.constants.MovieConstants.*;
import com.fourhorseman.movie.model.MovieDetails;
import com.fourhorseman.movie.model.Movies;
import com.fourhorseman.movie.model.MoviesInfo;
import com.fourhorseman.movie.services.MovieService;


@RestController
public class MovieController {

	@Autowired
	private MovieService service;
	
	/*@GetMapping()
	public ResponseEntity<Object> healthCheck() {
		Object obj = service.healthCheck();
		if(obj!=null) {
		ResponseEntity<Object> response = new ResponseEntity<>(HttpStatus.OK);
		return response;
		}
		return null;
	}*/
	
	@GetMapping(MOVIES)
	public List<MoviesInfo> getAllMovies(){
		return service.getAllMovieList();
	}
	
	@GetMapping(PERTICULAR_MOVIE)
	public Movies getMovieDetails(@PathVariable String movieName) {
		
		MoviesInfo mInfo = service.getMovieInfo(movieName);
		
		Map<String, String> uriVariables = new HashMap<String,String>();
		uriVariables.put("movieName", movieName);
		ResponseEntity<MovieDetails> response = new RestTemplate().getForEntity(MOVIE_DETAILS_URI, MovieDetails.class, uriVariables);
		MovieDetails details = response.getBody();
		
		return new Movies(mInfo, details);	
	}
}
