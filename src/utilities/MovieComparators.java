/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import entity.MovieEntity;
import java.util.Comparator;

/**
 *
 * @author Gabi
 */
public class MovieComparators {

    public static Comparator<MovieEntity> sortByMovieName = new Comparator<MovieEntity>() {
        @Override
        public int compare(MovieEntity movie1, MovieEntity movie2) {

            return movie1.getMovieName().compareTo(movie2.getMovieName());

        }
    };

    public static Comparator<MovieEntity> sortByMovieDirector = new Comparator<MovieEntity>() {
        @Override
        public int compare(MovieEntity movie1, MovieEntity movie2) {

            return movie2.getDirector().compareTo(movie1.getDirector());

        }
    };
    public static Comparator<MovieEntity> sortByMovieDuration = new Comparator<MovieEntity>() {
        @Override
        public int compare(MovieEntity movie1, MovieEntity movie2) {

            return movie2.getDuration().compareTo(movie1.getDuration());

        }
    };

}


