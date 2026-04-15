package models;

public class Character {
    private String name;
    private int chapter;
    private int episode;
    private int year;
    private String note;

    public Character(String name, int chapter, int episode, int year, String note) {
        this.name = name;
        this.chapter = chapter;
        this.episode = episode;
        this.year = year;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
