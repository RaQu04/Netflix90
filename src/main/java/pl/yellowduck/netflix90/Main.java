package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.Resources.Actor;
import pl.yellowduck.netflix90.Resources.Director;
import pl.yellowduck.netflix90.Resources.Gender;
import pl.yellowduck.netflix90.Resources.Person;

import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        // System.out.println("Hello Netflix90");

        Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);
        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender.MALE);
        Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor greg = new Actor("Greg", "Sestero", Gender.MALE);
        Director annie = new Director("Annie", "Wolite", Gender.FEMALE);

        Set<Person> persons = new HashSet<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(juliette);
        persons.add(greg);
        persons.add(annie);

        for (Person person: persons) {
            person.introduce();
        }


    }
}
