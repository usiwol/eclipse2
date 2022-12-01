package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.vo.Movie;

// Service : 서비스에서 로직(알고리즘)을 구현한다.
// 비즈니스 구역(로직)
@Service
public class ApiService {
	
	// 주석달기
	// alt + shift + j
	/**
	 * @Since : 2022. 11. 23.
	 * @Author : jh
	 * @Return : List<Movie>
	 * @Comment : 영화만들기
	 */
	public List<Movie> makeMovies() {
		
		List<Movie> list = new ArrayList<Movie>();
		
		Movie movie = new Movie();
		movie.setTitle("Just Friends");
	    movie.setYear("2005년");
	    movie.setRuntime("96 min");
	    movie.setGenre("Comedy, Romance");
	      
	    Movie movie2 = new Movie();
	    movie2.setTitle("The Holiday");
	    movie2.setYear("2006년");
	    movie2.setRuntime("135 min");
	    movie2.setGenre("Melo, Romance");
	    
	    Movie movie3 = new Movie();
	    movie3.setTitle("Bridget Jones's Diary");
	    movie3.setYear("2001년");
	    movie3.setRuntime("97 min");
	    movie3.setGenre("Drama");  
	    
	    list.add(movie);
	    list.add(movie2);
	    list.add(movie3);
		
		return list;
	}
	
}
