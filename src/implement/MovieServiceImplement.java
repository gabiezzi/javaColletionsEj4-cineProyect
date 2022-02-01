/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implement;

import constants.MovieConstants;
import entity.MovieEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import service.MovieService;
import utilities.MovieComparators;

/**
 *
 * @author Gabi
 */
public class MovieServiceImplement implements MovieService {

    Scanner read;

    ArrayList<MovieEntity> movieList;

    public MovieServiceImplement(Scanner read, ArrayList<MovieEntity> movieList) {
        this.read = new Scanner(System.in);
        this.movieList = new ArrayList();
    }

    @Override
    public MovieEntity newMovie() {

        MovieEntity newMovie = new MovieEntity();

        System.out.println("Insert the movie name!");
        newMovie.setMovie(read.next());
        System.out.println("Insert the movie director!");
        newMovie.setDirector(read.next());
        System.out.println("Insert the movie duration!");
        newMovie.setMovie(read.next());

        return newMovie;
    }

    @Override
    public String addMovieToTheList(MovieEntity newMovie) {

        movieList.add(newMovie);
        return newMovie.getMovie() + " ," + newMovie.getDirector() + " ," + newMovie.getDuration() + ":" + " ADDED to the list";

    }

    @Override
    public String showAllTheMovies() {

        String allMovies = "All Movies: ";
        for (MovieEntity unitary : movieList) {
            allMovies += "\n" + unitary.toString();
        }

        return allMovies;
    }

    @Override
    public String showMoviesOfMoreThanOneHour() {

        Iterator<MovieEntity> it = movieList.iterator();
        String moreThanOneHourMovie = " Movies from more than 1 hour: \n";
        while (it.hasNext()) {

            if (it.next().getDuration() >= 60) {

                moreThanOneHourMovie += it.next().toString();

            }

        }

        return moreThanOneHourMovie;
    }

    @Override
    public String SortMovieLongerToShorterDuration() {

        Collections.sort(movieList, MovieComparators.sortByMovieDuration);

        String sortedByDuration = "Movie Sorted by Duration: \n";

        for (MovieEntity unitary : movieList) {

            sortedByDuration += unitary;

        }

        return sortedByDuration;
    }

    @Override
    public String SortMovieShorterToLongerDuration() {

        Collections.sort(movieList, MovieComparators.sortByMovieName);

        String sortedByName = " Movies Sorted by Name : \n";

        for (MovieEntity unitary : movieList) {

            sortedByName += unitary;

        }

        return sortedByName;

    }

    @Override
    public String SortMoviesAlphabeticallyByName() {

        Collections.sort(movieList, Collections.reverseOrder(MovieComparators.sortByMovieDuration) );

        String sortedByName = " Movies Sorted by Name : \n";

        for (MovieEntity unitary : movieList) {

            sortedByName += unitary;

        }

        return sortedByName;
    }

    @Override
    public String SortMoviesAlphabeticallyByDirector() {

        Collections.sort(movieList, MovieComparators.sortByMovieDirector);

        String sortedByDirector = "Movies Sorted By Director : \n";

        for (MovieEntity unitary : movieList) {

            sortedByDirector += unitary;

        }

        return sortedByDirector;
    }

    @Override
    public void menu() {

        int option = 0;

        do {

            System.out.println(MovieConstants.MENU_MESSAGE);

            option = read.nextInt();
            
            switch (option) {
                case 1:
                    
                    break;
               
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
               
                case 4:
                    
                    break;
                
                case 5:
                    
                    break;
                
                case 6:
                    
                    break;
                
                case 7:
                    
                    break;
                default:
                    throw new AssertionError();
            }

        } while (option != 8);

    }
}
