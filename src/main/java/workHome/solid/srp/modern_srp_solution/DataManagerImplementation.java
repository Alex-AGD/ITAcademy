package main.java.workHome.solid.srp.modern_srp_solution;

public class DataManagerImplementation implements IDataManager{
    @Override
    public void send(String message) {
        System.out.println("data send successfully");
    }

    @Override
    public int receive() {
        System.out.println("data received successfully");
        return 0;
    }
}
