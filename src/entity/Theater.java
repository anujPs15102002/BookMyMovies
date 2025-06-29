package entity;

public class Theater {
    private int theater_id;
     private String name;
    private String city;

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public int getTheater_id() {
        return theater_id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTheater_id(int theater_id) {
        this.theater_id = theater_id;
    }

    public Theater(int theater_id, String name, String city){
        this.city=city;
        this.name=name;
        this.theater_id=theater_id;
    }
}
