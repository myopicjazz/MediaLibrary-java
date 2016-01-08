package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by matt on 12/5/15.
 */
public class Movie implements Media {
    private String title;
    private int releaseYear;
    private String genre;
    private String format;
    private String keyPlayer;
    private String series;
    private String rating;

    public Movie() {}

    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void selectGenre(){
        Scanner userInput = new Scanner(System.in);
        int genreNumber = 0;
        String movieGenre = "";
        System.out.println("1 - Fantasy");
        System.out.println("2 - Science Fiction");
        System.out.println("3 - Mystery");
        System.out.println("4 - Romance");
        System.out.println("5 - Classics");
        System.out.println("6 - Horror");
        System.out.println("7 - Action/Adventure");
        System.out.println("8 - Documentary");
        System.out.println("");
        System.out.print("Choose the number of one of the genres above: ");
        try {
            genreNumber = userInput.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println(e);
        }

        switch (genreNumber){
            case 1:
                movieGenre = "Fantasy";
                break;
            case 2:
                movieGenre = "Science Fiction";
                break;
            case 3:
                movieGenre = "Mystery";
                break;
            case 4:
                movieGenre = "Romance";
                break;
            case 5:
                movieGenre = "Classics";
                break;
            case 6:
                movieGenre = "Horror";
                break;
            case 7:
                movieGenre = "Action/Adventure";
                break;
            case 8:
                movieGenre = "Documentary";
                break;
            default:
                movieGenre = "Other";
                break;
        }
        setGenre(movieGenre);
    };

    public String getFormat() {
        return format;
    }

    @Override
    public void setFormat(String format) {
        this.format = format;
    }

    public void selectFormat() {
        Scanner userInput = new Scanner(System.in);
        int formatNumber = 0;
        String movieFormat = "";
        System.out.println("1 - DVD");
        System.out.println("2 - BluRay");
        System.out.println("3 - VHS");
        System.out.println("4 - Amazon");
        System.out.println("5 - Google Play");
        System.out.println("6 - iMovie");
        System.out.println("");
        System.out.print("Choose the number of one of the formats: above ");
        try {
            formatNumber = userInput.nextInt();
        }
        catch (InputMismatchException e){
            System.err.println(e);
        }

        switch (formatNumber){
            case 1:
                movieFormat = "DVD";
                break;
            case 2:
                movieFormat = "BluRay";
                break;
            case 3:
                movieFormat = "VHS";
                break;
            case 4:
                movieFormat = "Amazon";
                break;
            case 5:
                movieFormat = "Google Play";
                break;
            case 6:
                movieFormat = "iMovie";
                break;
            default:
                movieFormat = "Other";
                break;
        }
        setFormat(movieFormat);
    };

    public String getKeyPlayer() {
        return keyPlayer;
    }

    @Override
    public void setKeyPlayer(String firstName, String lastName) {
        this.keyPlayer = lastName + ", " + firstName;
    }

    @Override
    public void setKeyPlayer(String keyPlayer) {
        this.keyPlayer = keyPlayer;
    }

    public String getSeries() {
        return series;
    }

    @Override
    public void setSeries(String series) {
        this.series = series;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}