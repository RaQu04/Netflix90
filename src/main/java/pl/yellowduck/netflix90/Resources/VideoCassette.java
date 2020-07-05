package pl.yellowduck.netflix90.Resources;

import java.math.BigDecimal;
import java.util.Set;

public class VideoCassette {

    private String ID;
    private BigDecimal price;
    private String title;
    private Director director;
    private Category category; //odwołanie do enuma
    private Set<Actor> actors;

    public VideoCassette(String ID, BigDecimal price, String title, Director director, Category category, Set<Actor> actors) {
        this.ID = ID;
        this.price = price;
        this.title = title;
        this.director = director;
        this.category = category;
        this.actors = actors;
    }

    public void printOut() {
        // | ID | Title | Price | Director | Actors |

        StringBuilder builder = new StringBuilder();
        builder.append("|")
                .append(this.ID)
                .append("|")
                .append(this.title)
                .append("|")
                .append(this.price)
                .append("|")
                .append(this.category)
                .append("|")
                .append(this.director)
                .append("|")
                .append(this.actors)
                .append("|");

        System.out.println(builder.toString());
    }
}
