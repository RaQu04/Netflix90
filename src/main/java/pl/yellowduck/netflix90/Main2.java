package pl.yellowduck.netflix90;

import lombok.Getter;
import pl.yellowduck.netflix90.Resources.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        Director tommy = new Director("Tommy", "Wiseau", Gender.MALE);

        Actor tommyActor = new Actor("Tommy", "Wiseau", Gender.MALE);
        Actor juliette = new Actor("Juliette", "Danielle", Gender.FEMALE);
        Actor greg = new Actor("Greg", "Sestero", Gender.MALE);

        Client clientLukas = new Client("Lukasz",
                "Rakowiecki",
                Gender.MALE,
                new Address("Żelazna", 24, "Poznań", "51-123", "Poland"),
                ClientStatus.VIP);
        Client clientOliwia = new Client("Oliwia",
                "Splawska",
                Gender.FEMALE,
                new Address("Owocowa", 12, "Kalisz", "51-111", "Poland"),
                ClientStatus.NORMAL);

        List<Person> actors = List.of(tommy, tommyActor, juliette, greg);
 /*       actors.add(tommy);
        actors.add(tommyActor);
        actors.add(juliette);
        actors.add(greg);*/


        VideoCassette theRoom = new VideoCassette(
                "VI001",
                BigDecimal.valueOf(20),
                "The room",
                tommy,
                Category.DRAMA,
                Set.of(tommyActor, juliette, greg));


        theRoom.printOut();



        for (Person person : actors) {
            person.introduce();
        }



        List<Client> clients = List.of(clientLukas, clientOliwia);


        for (Client client: clients) {
            client.introduce();
        }

        clientLukas.discount(theRoom);
        clientOliwia.discount(theRoom);





    }
}

