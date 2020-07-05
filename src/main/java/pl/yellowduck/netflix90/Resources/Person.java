package pl.yellowduck.netflix90.Resources;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public abstract class Person{
    protected String firstName;
    protected String lastName;
    protected final Gender gender;

    public Person(String firstName, String lastName, Gender gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }



    public abstract void introduce();



}
