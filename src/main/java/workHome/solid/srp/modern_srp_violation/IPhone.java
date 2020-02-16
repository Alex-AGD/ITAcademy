package main.java.workHome.solid.srp.modern_srp_violation;

public interface IPhone {

    void dial(String phoneNumber);
    void disconnect(); //connection management

    void send(String message);
    int receive(); //data management
}
