package com.fourhorseman.movie.constants;

public class MovieConstants {
	
	
	public static final String MOVIES = "/movies";
	public static final String PERTICULAR_MOVIE = "/movies/{movieName}";
	
	public static final String PROTOCOL = "http://";
	public static final String COLONS = ":";
	
	public static final String MOVIE_DETAILS_HOST = "localhost";
	public static final int MOVIE_DETAILS_PORT=8083;
	
	public static final String MOVIE_DETAILS_URI = PROTOCOL + MOVIE_DETAILS_HOST + COLONS + MOVIE_DETAILS_PORT 
												   + "/{movieName}/movie-details";

}
