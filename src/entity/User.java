package entity;

public class User {
    private int user_id;
    private String name;
    private String email;
    private String phone;

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User(int user_id, String name, String email, String phone){
        this.user_id=user_id;
        this.name=name;
        this.email=email;
        this.phone=phone;


    }
}
