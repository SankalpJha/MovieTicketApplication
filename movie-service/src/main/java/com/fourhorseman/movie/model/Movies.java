package com.fourhorseman.movie.model;

public class Movies {
	
	private MoviesInfo movieInfo;
	private MovieDetails movieDetails;
	
	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public Movies(MoviesInfo movieInfo, MovieDetails movieDetails) {
		super();
		this.movieInfo = movieInfo;
		this.movieDetails = movieDetails;
	}

	public MoviesInfo getMovieInfo() {
		return movieInfo;
	}

	public void setMovieInfo(MoviesInfo movieInfo) {
		this.movieInfo = movieInfo;
	}

	public MovieDetails getMovieDetails() {
		return movieDetails;
	}

	public void setMovieDetails(MovieDetails movieDetails) {
		this.movieDetails = movieDetails;
	}
	
	

}
