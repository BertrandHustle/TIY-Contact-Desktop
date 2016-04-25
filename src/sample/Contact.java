package sample;

public class Contact {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email){

        this.name = name;
        this.phone = phone;
        this.email = email;

    }

    @Override
    public String toString() {
        return name + ", " + phone + ", " + email;
    }


}
