package workHome.solid.srp.modern_srp_solution;

public class PhoneClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImplementation(), new DataManagerImplementation());

        phone.dial("456209");
        phone.send("message text");
        phone.receive();
        phone.disconnect();

    }
}
