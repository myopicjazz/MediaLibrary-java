package com.company;

/**
 * Created by matt on 12/5/15.
 */
public class MediaFactory {
    //use getMedia method to get object of type shape
    public Media getMedia(String mediaType) {
        if (mediaType == null) {
            return null;
        }
        if (mediaType.equalsIgnoreCase("BOOK")) {
            return new Book();

        } else if (mediaType.equalsIgnoreCase("MOVIE")) {
            return new Movie();

        } else if (mediaType.equalsIgnoreCase("MUSIC")) {
            return new Music();
        }

        return null;
    }
}
