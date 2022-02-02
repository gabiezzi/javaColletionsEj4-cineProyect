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

    public MovieServiceImplement() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.movieList = new ArrayList();
    }

    @Override
    public MovieEntity newMovie() {

        MovieEntity newMovie = new MovieEntity();

        System.out.println("Insert the movie name!");
        newMovie.setMovieName(read.next());
        System.out.println("Insert the movie director!");
        newMovie.setDirector(read.next());
        System.out.println("Insert the movie duration!");
        newMovie.setDuration(read.nextInt());

        return newMovie;
    }

    @Override
    public String addMovieToTheList(MovieEntity newMovie) {

        movieList.add(newMovie);
        return newMovie.getMovieName() + " ," + newMovie.getDirector() + " ," + newMovie.getDuration() + ":" + " ADDED to the list";

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

        String moreThanOneHourMovie = "Movies from more than 1 hour: \n";
        
        Iterator<MovieEntity> it = movieList.iterator();
        
        while (it.hasNext()) {
          
            if (it.next().getDuration() <= 60 ) {
                
                moreThanOneHourMovie += it.next().toString() + "\n" ;
                
            }
            
        }
        
//        for (int i = 0; i < movieList.size(); i++) {
//
//            if (movieList.get(i).getDuration() >= 60) {
//
//                moreThanOneHourMovie += movieList.get(i).toString() + "\n";
//
//            }
//
//        }

        return moreThanOneHourMovie;
    }

    @Override
    public String SortMovieLongerToShorterDuration() {

        Collections.sort(movieList, MovieComparators.sortByMovieDuration);

        String sortedByDuration = "Movie Sorted by Duration: \n";

        for (MovieEntity unitary : movieList) {

            sortedByDuration += unitary+ "\n";

        }

        return sortedByDuration;
    }

    @Override
    public String SortMovieShorterToLongerDuration() {

        Collections.sort(movieList, Collections.reverseOrder(MovieComparators.sortByMovieDuration));

        String sortedByName = " Movies Sorted by Name : \n";

        for (MovieEntity unitary : movieList) {

            sortedByName += unitary+ "\n";

        }

        return sortedByName;

    }

    @Override
    public String SortMoviesAlphabeticallyByName() {

        Collections.sort(movieList, MovieComparators.sortByMovieName);

        String sortedByName = " Movies Sorted by Name : \n";

        for (MovieEntity unitary : movieList) {

            sortedByName += unitary+ "\n";

        }

        return sortedByName;
    }

    @Override
    public String SortMoviesAlphabeticallyByDirector() {

        Collections.sort(movieList, MovieComparators.sortByMovieDirector);

        String sortedByDirector = "Movies Sorted By Director : \n";

        for (MovieEntity unitary : movieList) {

            sortedByDirector += unitary+ "\n";

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

                    addMovieToTheList(newMovie());
                    break;

                case 2:
                    System.out.println(showAllTheMovies());
                    break;

                case 3:
                    System.out.println(showMoviesOfMoreThanOneHour());
                    break;

                case 4:
                    System.out.println(SortMovieLongerToShorterDuration());
                    break;

                case 5:
                    System.out.println(SortMovieShorterToLongerDuration());
                    break;

                case 6:
                    System.out.println(SortMoviesAlphabeticallyByName());
                    break;

                case 7:
                    System.out.println(SortMoviesAlphabeticallyByDirector());
                    break;
                case 8:
                    System.out.println("Are you sure you want to quit ?");
                    String optionSwitch = read.next();
                    
                    if (optionSwitch.equalsIgnoreCase("y")) {

                        System.out.println("You've quited.");
                    } else {

                        option = 0;

                    }

            }

        } while (option != 8);

    }
}
