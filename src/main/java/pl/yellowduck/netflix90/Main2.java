package pl.yellowduck.netflix90;

import pl.yellowduck.netflix90.Resources.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        // System.out.println("Hello Netflix90");

        Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);
        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender.MALE);
        Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor greg = new Actor("Greg", "Sestero", Gender.MALE);

        List<Person> persons = new ArrayList<>();
        persons.add(tommy);
        persons.add(tommyActor);
        persons.add(juliette);
        persons.add(greg);

        VideoCassette theRoom = new VideoCassette(
                "VI001",
                BigDecimal.valueOf(20),
                "The room",
                tommy,
                Category.DRAMA,
                Set.of(tommyActor, juliette, greg));

        theRoom.printOut();

        System.out.println();

/*        for (int i = 0; i < persons.size(); i++) {
            Person person = persons.get(i);
            person.introduce();
        }*/
    }
}

