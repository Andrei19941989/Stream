package com.company;

public class Movie {


    private String Name;
    private String Producer;
    private String Genre;
    private int Year;
    public Movie(String name,String producer,String genre,int year)
    {
        this.Name=name;
        this.Producer=producer;
        this.Genre=genre;
        this.Year=year;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "Name='" + Name + '\'' +
                ", Producer='" + Producer + '\'' +
                ", Genre='" + Genre + '\'' +
                ", Year=" + Year +
                '}';
    }


    public String getName() {
        return Name;
    }

    public String getProducer() {
        return Producer;
    }

    public String getGenre() {
        return Genre;
    }

    public int getYear() {
        return Year;
    }




}
