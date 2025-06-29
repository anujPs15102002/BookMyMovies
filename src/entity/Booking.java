package entity;

import java.util.List;

public class Booking {
    private int booking_id;
    private int user_id;
    private int show_id;
    private List<String> seat_booked;
    private double total_price;

    public int getBooking_id() {
        return booking_id;
    }

    public List<String> getSeat_booked() {
        return seat_booked;
    }

    public int getShow_id() {
        return show_id;
    }

    public double getTotal_price() {
        return total_price;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }



    public void setSeat_booked(List<String> seat_booked) {
        this.seat_booked = seat_booked;
    }

    public void setShow_id(int show_id) {
        this.show_id = show_id;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public Booking(int booking_id, int user_id, int show_id, List<String> seat_booked, double total_price){
        this.booking_id=booking_id;
        this.user_id=user_id;
        this.show_id=show_id;
        this.seat_booked=seat_booked;
        this.total_price=total_price;
    }
}
