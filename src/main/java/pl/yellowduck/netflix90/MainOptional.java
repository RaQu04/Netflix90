package pl.yellowduck.netflix90;

import java.util.Optional;

public class MainOptional {
    public static void main(String[] args) {

        Optional<String> someString = getSomeString();
        if(someString.isPresent()){     //isPresent jezeli nie jest pusty
            String s = someString.get();
            char c = s.charAt(5);
        }

        String myExpectionValue = someString.orElse("default");
        System.out.println(myExpectionValue);



    }

    private static Optional <String> getSomeString() {
        return Optional.empty();
    }
}
