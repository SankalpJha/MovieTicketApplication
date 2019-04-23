package com.fourhorseman.details.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourhorseman.details.model.MovieDetails;
import com.fourhorseman.details.repository.MovieDetailsRepository;

@Service
public class MovieDetailsService {

	@Autowired
	private MovieDetailsRepository detailsRepo;
	
	
	public MovieDetails getMovieDetails(String movieName) {
		return detailsRepo.findByMovieName(movieName);
	}
}
