package com.company;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Cinema {
    private ArrayList<Movie>mov;
    public Cinema()
    {
        mov = new ArrayList<>();
    }
    public void add(Movie m)
    {
        mov.add(m);

    }

    public ArrayList<Movie> getMoviesByGenre(String stroka)
    {
        return (ArrayList<Movie>) mov.stream().filter(i->i.getGenre().equals(stroka)).collect(Collectors.toList());
    }

    public ArrayList<Movie> getMoviesProducer(String stroka)
    {
      return ( ArrayList<Movie>) mov.stream().filter(i->i.getProducer().equals(stroka)).collect(Collectors.toList());
    }

    public ArrayList<Movie> getMoviesByWord (String stroka)
    {
      return(ArrayList<Movie>) mov.stream().filter(i->i.getName().contains(stroka)).collect(Collectors.toList());
    }

    public ArrayList<Movie> getMoviesByYear(int stroka)
    {
        return( ArrayList<Movie>) mov.stream().filter(i->i.getYear()>=stroka).collect(Collectors.toList());
    }
}
