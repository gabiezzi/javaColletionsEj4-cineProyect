/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.MovieEntity;

/**
 *
 * @author Gabi
 */
public interface MovieService {
    
    public MovieEntity newMovie();
    public String addMovieToTheList(MovieEntity newMovie);
    public String showAllTheMovies();
    public String showMoviesOfMoreThanOneHour();
    public String SortMovieLongerToShorterDuration();
    public String SortMovieShorterToLongerDuration();
    public String SortMoviesAlphabeticallyByName();
    public String SortMoviesAlphabeticallyByDirector();
    public void menu();
}
