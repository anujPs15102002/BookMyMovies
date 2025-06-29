package entity;

public class Movie {

         private int movie_id;
        private String title;
        private  String genre;
        private String lang;
        private int duration;

    public int getDuration() {
        return duration;
    }

    public String getGenre() {
        return genre;
    }

    public String getLang() {
        return lang;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public String getTitle() {
        return title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie(int duration, String genre, String lang, String title, int movie_id) {
        this.duration = duration;
        this.genre= genre;
        this.lang=lang;
        this.movie_id=movie_id;
        this.title=title;
    }



}
