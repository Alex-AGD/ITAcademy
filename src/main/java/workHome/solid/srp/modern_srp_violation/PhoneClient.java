package main.java.workHome.solid.srp.modern_srp_violation;

public class PhoneClient {
    public static void main(String[] args) {
        IPhone phone = new Phone();

        phone.dial("456209");
        phone.send("message text");
        phone.receive();
        phone.disconnect();


    }
}
