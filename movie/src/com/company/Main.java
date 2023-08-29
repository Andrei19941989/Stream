package com.company;

public class Main {

    public static void main(String[] args) {
	 Cinema c =new Cinema();
     c.add(new Movie("ONO","King","horror",2017));
     c.add(new Movie("Sta wars","lucas","fantasika",1984));
     System.out.println();
     for(Movie item:c.getMoviesByYear(2000))
        {
         System.out.println(item);
        }
    }
}
