package com.fourhorseman.movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fourhorseman.movie.model.MoviesInfo;
import com.fourhorseman.movie.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepo;
	
	public List<MoviesInfo> getAllMovieList(){
		return movieRepo.findAll();
	}
	
	public MoviesInfo getMovieInfo(String movieName) {
		return movieRepo.findByMovieName(movieName);
	}

	/*public Object healthCheck() {
		return movieRepo.getDBStatus();
	}*/

}
