package pl.yellowduck.netflix90.Resources;

public class Client extends Person {

    public Client(String firstName, String lastName, Gender gender, Address address, ClientStatus clientStatus) {
        super(firstName, lastName, gender);
    }
    @Override
    public void introduce() {
        System.out.println("Hi, I am client and my name is " + getFirstName() + " "  + getLastName());
    }
}
