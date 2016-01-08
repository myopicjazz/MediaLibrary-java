package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String repeat = "b";
        ArrayList <Media> mediaObjects = new ArrayList<>();
        MediaFactory mediaFactory = new MediaFactory();

        while (!repeat.equals("no")) {
            String mediaType = "";
            String seriesName = "";
            int mediaChoice = 0;
             Scanner userInput = new Scanner(System.in);

            System.out.println("1 - Book");
            System.out.println("2 - Movie");
            System.out.println("3 - Music");
            System.out.println("");

            while (mediaChoice < 1 || mediaChoice > 3) {
                System.out.print("Select a number corresponding to one of the three options above: ");
                try {
                    mediaChoice = userInput.nextInt();
                }
                catch (InputMismatchException e) {
                    System.err.println(e);
                    System.exit(1);
                }

                if (mediaChoice == 1) {
                    mediaType = "BOOK";
                }
                else if (mediaChoice == 2) {
                    mediaType = "MOVIE";
                }
                else if (mediaChoice == 3) {
                    mediaType = "MUSIC";
                }
            }

            Media newMedia = mediaFactory.getMedia(mediaType);

            System.out.print("Title of new book, movie, or CD: ");
            userInput.nextLine();
            String title = userInput.nextLine().trim();
            newMedia.setTitle(title);
            System.out.print("Year of release: ");
            String yearReleased = userInput.next().trim();
            while (yearReleased.length() != 4) {
                System.out.println("You need to enter a year four using four digits.");
                System.out.print("Year of release: ");
                yearReleased = userInput.next().trim();
            }
            int yearOfRelease = Integer.parseInt(yearReleased);
            newMedia.setReleaseYear(yearOfRelease);
            System.out.print("First (or only) name of author, artist, or lead actor: ");
            userInput.nextLine();
            String firstNameAlpha = userInput.nextLine().trim();
            String firstName = firstNameAlpha.substring(0, 1).toUpperCase() + firstNameAlpha.substring(1);
            System.out.print("Last name of author, artist, or lead actor. Type \"none\" if person goes by Prince, Sting, etc.: ");
            String lastNameAlpha = userInput.nextLine().trim();
            String lastName = lastNameAlpha.substring(0, 1).toUpperCase() + lastNameAlpha.substring(1);
            if (lastName.equals("None")) {
                newMedia.setKeyPlayer(firstName);
            }
            else {
                newMedia.setKeyPlayer(firstName, lastName);
            }
            System.out.print("Is this part of a series? Answer yes or no. ");
            String partOfSeries = userInput.next().trim();
            if (partOfSeries.equals("no")) {
                seriesName = "N/A";
            }
            else if (partOfSeries.equals("yes")){
                System.out.print("Enter the series' name: ");
                userInput.nextLine();
                seriesName = userInput.nextLine().trim();
            }
            else {
                System.out.println("That really isn't valid a response. You need to re-effort from the beginning.");
                System.exit(0);
            }
            newMedia.setSeries(seriesName);
            newMedia.selectGenre();
            newMedia.selectFormat();

            mediaObjects.add(newMedia);

            System.out.print("Add more entries? Answer yes or no. ");
            repeat = userInput.next();
            repeat = repeat.trim().toLowerCase();
        }
        for (Media item : mediaObjects) {
            System.out.println("");
            System.out.println(item.getTitle());
            System.out.println(item.getReleaseYear());
            System.out.println(item.getGenre());
            System.out.println(item.getFormat());
            System.out.println(item.getKeyPlayer());
            System.out.println(item.getSeries());
            System.out.println("");
        }
    }
}
