package com.company;

/**
 * Created by matt on 12/5/15.
 */
public interface Media {
    public abstract void setTitle(String title);
    public abstract void setReleaseYear (int releaseYear);
    public abstract void setGenre(String genre);
    public abstract void selectGenre();
    public abstract void setFormat(String format);
    public abstract void selectFormat();
    public abstract void setKeyPlayer(String firstName, String lastName);
    public abstract void setKeyPlayer (String name);
    public abstract void setSeries(String series);
    public abstract String getTitle();
    public abstract int getReleaseYear ();
    public abstract String getGenre();
    public abstract String getFormat();
    public abstract String getKeyPlayer();
    public abstract String getSeries();
}
