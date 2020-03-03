package workHome.solid.srp.modern_srp_solution;

public class ConnectionManagerImplementation implements IConnectionManager{

    @Override
    public void dial(String phoneNumber) {
        System.out.println("connect established");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnected successfully");
    }}

