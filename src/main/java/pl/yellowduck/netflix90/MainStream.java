package pl.yellowduck.netflix90;

import com.sun.security.jgss.GSSUtil;
import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
    public static void main(String[] args) {

        List<String> capitals = new ArrayList<>();
        capitals.add("Warsaw");
        capitals.add("Berlin");
        capitals.add("Amsterdam");
        capitals.add("Lisbona");
        capitals.add("Paris");
        capitals.add("Rome");
        capitals.add("London");

        List<String> capitalsWithW = new ArrayList<>();

        for (String capital : capitals) {
            if (capital.startsWith("W")) {
                System.out.println(capital);
                capitalsWithW.add(capital);
            }
        }

        capitals.stream()
                .filter(p -> p.startsWith("W"))
                .collect(Collectors.toSet());      //zbiera wszystki elemty strumienia, które znalazły się na jego końcu

        Set<String> startWithL = new HashSet<>();

        for (String capital : capitals) {
            if (capital.startsWith("L")) {
                startWithL.add(StringUtils.reverse(capital.toUpperCase()));
            }
        }
        System.out.println(startWithL);


        Set<String> capitalWithReverse = capitals.stream()
                .filter(p -> p.startsWith("L"))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(capitalWithReverse);


        capitals.stream()
                .filter(p -> p.startsWith("O"))
                .findAny()
                .ifPresent(p -> System.out.println(p));


/*        IntBinaryOperator operator = new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return 0;
            }
        };

        IntBinaryOperator operator2 = (left, right) -> left + right;*/


    }
}
