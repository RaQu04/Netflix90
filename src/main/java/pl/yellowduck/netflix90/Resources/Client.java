package pl.yellowduck.netflix90.Resources;

import java.math.BigDecimal;

public class Client extends Person {
    protected ClientStatus clientStatus;
    protected Address address;


    public Client(String firstName, String lastName, Gender gender, Address address, ClientStatus clientStatus) {
        super(firstName, lastName, gender);
        this.address = address;
        this.clientStatus = clientStatus;
    }
    @Override
    public void introduce() {
        System.out.println("Hi, I am client and my name is " + getFirstName() + " "  + getLastName());
    }

    public void discount(VideoCassette videoCassette){
        switch (this.clientStatus){
            case VIP -> System.out.println(videoCassette.price.multiply(BigDecimal.valueOf(0.85))); // 15% rabatu
            case NORMAL -> System.out.println(videoCassette.price.multiply(BigDecimal.valueOf(0.95))); // 5 % rabatu
            default -> throw new IllegalStateException("Unexpected value: " + this.clientStatus);
        }
    }


}
