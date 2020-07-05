package pl.yellowduck.netflix90.Resources;




public class Actor extends Person {

    public Actor(String firstName, String lastName, Gender gender) {
        super(firstName, lastName, gender);
    }

    public void introduce() {
        switch (this.gender) {
            case MALE -> System.out.println("My name is " + getFirstName() + " " + getLastName() + ". I am an actor");
            case FEMALE -> System.out.println("My name is " + getFirstName() + " " + getLastName() + ". I am an actress");
        }
/*        if (Gender.MALE.equals(gender))
            System.out.println("My name is " + firstName + " " + lastName + ". I am an actor");
        else if (Gender.FEMALE.equals(gender))
            System.out.println("My name is " + firstName + " " + lastName + ". I am an actress");*/
    }
}

