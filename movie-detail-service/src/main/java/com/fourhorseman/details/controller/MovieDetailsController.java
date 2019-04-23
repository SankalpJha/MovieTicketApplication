package com.fourhorseman.details.controller;

import static com.fourhorseman.details.constants.MovieDetailConstants.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fourhorseman.details.model.MovieDetails;
import com.fourhorseman.details.service.MovieDetailsService;

@RestController
public class MovieDetailsController {

	@Autowired
	private MovieDetailsService detailService;
	
	@GetMapping(MOVIE_DETAILS)
	public MovieDetails getDetails(@PathVariable String movieName) {
		return detailService.getMovieDetails(movieName);
	}
}
