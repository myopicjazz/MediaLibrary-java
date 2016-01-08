package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by matt on 12/5/15.
 */
public class Book implements Media {
    private String title;
    private int releaseYear;
    private String genre;
    private String format;
    private String keyPlayer;
    private String series;

    public Book () {}

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
        String bookGenre = "";
        System.out.println("1 - Fantasy");
        System.out.println("2 - Science Fiction");
        System.out.println("3 - Mystery");
        System.out.println("4 - Romance");
        System.out.println("5 - Classics");
        System.out.println("6 - Horror");
        System.out.println("7 - Biographies");
        System.out.println("8 - Self Help");
        System.out.println("");
        System.out.print("Choose the number of one of the genres above: ");
        try {
            genreNumber = userInput.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println(e);
        }

        switch (genreNumber){
            case 1:
                bookGenre = "Fantasy";
                break;
            case 2:
                bookGenre = "Science Fiction";
                break;
            case 3:
                bookGenre = "Mystery";
                break;
            case 4:
                bookGenre = "Romance";
                break;
            case 5:
                bookGenre = "Classics";
                break;
            case 6:
                bookGenre = "Horror";
                break;
            case 7:
                bookGenre = "Biographies";
                break;
            case 8:
                bookGenre = "Self Help";
                break;
            default:
                bookGenre = "Other";
                break;
        }
        setGenre(bookGenre);
    }

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
        String bookFormat = "";
        System.out.println("1 - Hardback");
        System.out.println("2 - Paperback");
        System.out.println("3 - PDF");
        System.out.println("4 - Kindle");
        System.out.println("5 - Nook");
        System.out.println("6 - Audiobook");
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
                bookFormat = "Hardback";
                break;
            case 2:
                bookFormat = "Paperback";
                break;
            case 3:
                bookFormat = "PDF";
                break;
            case 4:
                bookFormat = "Kindle";
                break;
            case 5:
                bookFormat = "Nook";
                break;
            case 6:
                bookFormat = "Audiobook";
                break;
            default:
                bookFormat = "Other";
                break;
        }
        setFormat(bookFormat);
    }

    public String getKeyPlayer() {
        return keyPlayer;
    }

    @Override
    public void setKeyPlayer(String firstName, String lastName) {
        this.keyPlayer = lastName + ", " + firstName;
    }

    @Override
    public void setKeyPlayer(String keyPlayer) { this.keyPlayer = keyPlayer; }

    public String getSeries() {
        return series;
    }

    @Override
    public void setSeries(String series) {
        this.series = series;
    }
}