package service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookMyMovieApp {
    public static void main(String[] args) {
        BookMyMovie bmm= new BookMyMovie();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter City:");
        String city = sc.next();
        bmm.displayTheaters(city);
        System.out.println(" Enter Theater Id and Movie Id:");
        int theaterId= sc.nextInt();
        int movieId= sc.nextInt();
        bmm.displayShows(theaterId,movieId);
        System.out.println(" Enter  ShowId and Number Of Seat");
        int ShowId= sc.nextInt();
        List<String> ss= Arrays.asList("A1","A2");
        bmm.bookTickets(1,ShowId,ss);
    }


}
