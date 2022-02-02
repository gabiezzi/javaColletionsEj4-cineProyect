/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Gabi
 */
public class MovieEntity {

    private String movieName;
    private String director;
    private Integer duration; // the duration of the movie in minutes.

    public MovieEntity(String movieName, String director, int duration) {
        this.movieName = movieName;
        this.director = director;
        this.duration = duration;
    }

    public MovieEntity() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "MovieEntity{" + "movieName=" + movieName + ", director=" + director + ", duration=" + duration + '}';
    }

}
