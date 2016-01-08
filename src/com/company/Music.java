package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by matt on 12/5/15.
 */
public class Music implements Media {
    private String title;
    private int releaseYear;
    private String genre;
    private String format;
    private String keyPlayer;
    private String series;

    public Music() {}

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

    public void selectGenre() {
        Scanner userInput = new Scanner(System.in);
        int genreNumber = 0;
        String musicGenre = "";
        System.out.println("1 - Rock");
        System.out.println("2 - Pop");
        System.out.println("3- Country");
        System.out.println("4 - Jazz");
        System.out.println("5 - Fusion");
        System.out.println("6 - Christian");
        System.out.println("7 - Reggae");
        System.out.println("8 - Christmas");
        System.out.println("9 - Easy Listening");
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
                musicGenre = "Rock";
                break;
            case 2:
                musicGenre = "Pop";
                break;
            case 3:
                musicGenre = "Country";
                break;
            case 4:
                musicGenre = "Jazz";
                break;
            case 5:
                musicGenre = "Fusion";
                break;
            case 6:
                musicGenre = "Christian";
                break;
            case 7:
                musicGenre = "Reggae";
                break;
            case 8:
                musicGenre = "Christmas";
                break;
            case 9:
                musicGenre = "Easy Listening";
                break;
            default:
                musicGenre = "Other";
                break;
        }
        setGenre(musicGenre);
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
        String musicFormat = "";
        System.out.println("1 - CD");
        System.out.println("2 - Cassette");
        System.out.println("3 - Vinyl");
        System.out.println("4 - MP3");
        System.out.println("5 - Google Play");
        System.out.println("6 - iTunes");
        System.out.println("");
        System.out.print("Choose the number of one of the formats: above ");
        try {
            formatNumber = userInput.nextInt();
        }
        catch (InputMismatchException e) {
            System.err.println(e);
        }

        switch (formatNumber){
            case 1:
                musicFormat = "CD";
                break;
            case 2:
                musicFormat = "Cassette";
                break;
            case 3:
                musicFormat = "Vinyl";
                break;
            case 4:
                musicFormat = "MP3";
                break;
            case 5:
                musicFormat = "Google Play";
                break;
            case 6:
                musicFormat = "iTunes";
                break;
            default:
                musicFormat = "Other";
                break;
        }
        setFormat(musicFormat);
    };

    public String getKeyPlayer() {
        return keyPlayer;
    }

    @Override
    public void setKeyPlayer(String firstName, String lastName) {
        this.keyPlayer = lastName + ", " + firstName;
    }

    @Override
    public void setKeyPlayer(String keyPlayer) {this.keyPlayer = keyPlayer; }

    public String getSeries() {
        return series;
    }

    @Override
    public void setSeries(String series) {
        this.series = series;
    }
}