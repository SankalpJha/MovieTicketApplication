package com.fourhorseman.details.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieDetails {
	
	@Id
	@GeneratedValue
	private int descId;
	private String movieName;
	private String synopsis;
	private String cast;
	private String crew;
	
	public MovieDetails() {
		// TODO Auto-generated constructor stub
	}

	public MovieDetails(String movieName, String synopsis, String cast, String crew) {
		super();
		this.movieName = movieName;
		this.synopsis = synopsis;
		this.cast = cast;
		this.crew = crew;
	}

	public int getDescId() {
		return descId;
	}

	public void setDescId(int descId) {
		this.descId = descId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getCrew() {
		return crew;
	}

	public void setCrew(String crew) {
		this.crew = crew;
	}

}

