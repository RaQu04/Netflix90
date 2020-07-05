package pl.yellowduck.netflix90.Resources;



public class Director extends Person {

    public Director(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }


    public void introduce() {
        switch (this.gender) {
            case MALE -> System.out.println("My name is " + getFirstName() + " " + getLastName() + ". I am a director");
            case FEMALE -> System.out.println("My name is " + getFirstName() + " " + getLastName() + ". I am a mrs director");
        }
/*        if(Gender.MALE.equals(gender))
            System.out.println("My name is " + firstName + " " + lastName + ". I am a director");
        else if(Gender.FEMALE.equals(gender))
            System.out.println("My name is " + firstName + " " + lastName + ". I am a mrs director");*/
    }


}
