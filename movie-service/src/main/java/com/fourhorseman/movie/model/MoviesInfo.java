package com.fourhorseman.movie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MoviesInfo {
	
	@Id
	@GeneratedValue
	private int mid;
	private String movieName;
	private String language;
	private String genre;
	private boolean is2D;
	private boolean is3D;


	public MoviesInfo() {
		// TODO Auto-generated constructor stub
	}

	public MoviesInfo(String movieName, String language, String genre, boolean is2d, boolean is3d) {
		super();
		this.movieName = movieName;
		this.language = language;
		this.genre = genre;
		is2D = is2d;
		is3D = is3d;
	}

	public int getmId() {
		return mid;
	}

	public void setmId(int mId) {
		this.mid = mId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getLanguage() {
		return language;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getGenre() {
		return genre;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public boolean isIs2D() {
		return is2D;
	}

	public void setIs2D(boolean is2d) {
		is2D = is2d;
	}

	public boolean isIs3D() {
		return is3D;
	}

	public void setIs3D(boolean is3d) {
		is3D = is3d;
	}

	@Override
	public String toString() {
		return "Movies [mId=" + mid + ", movieName=" + movieName + ", language=" + language + ", genre=" + genre + ", is2D="
				+ is2D + ", is3D=" + is3D + "]";
	}
	
	
}
