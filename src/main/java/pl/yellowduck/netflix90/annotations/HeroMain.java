package pl.yellowduck.netflix90.annotations;

public class HeroMain {

    public static void main(String[] args) {

        Hero antman = new Hero("Antman", "power1", "power2");

        System.out.println(antman.getSuperpowers());

        // antman.getSuperpowers().add("power3");


        antman.addSuperpower("Power4");
        System.out.println(antman.getSuperpowers());
    }
}
