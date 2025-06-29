package entity;

public class Show {
    private int show_id;
    private int movie_id;
    private int theater_id;
    private String timing;
    private int available_seat;

    public int getAvailable_seat() {
        return available_seat;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public int getShow_id() {
        return show_id;
    }

    public int getTheater_id() {
        return theater_id;
    }

    public String getTiming() {
        return timing;
    }

    public void setAvailable_seat(int available_seat) {
        this.available_seat = available_seat;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public void setTheater_id(int theater_id) {
        this.theater_id = theater_id;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    public Show(int show_id, int movie_id, int theater_id, String timing, int available_seat){
        this.show_id=show_id;
        this.movie_id=movie_id;
        this.theater_id=theater_id;
        this.timing=timing;
        this.available_seat=available_seat;
    }
}
