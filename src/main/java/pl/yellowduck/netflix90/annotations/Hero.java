package pl.yellowduck.netflix90.annotations;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public class Hero {


    private final String name;
    private Set<String> superpowers;

    public Hero(String name, String... powers) {
        this.name = name;
        this.superpowers = new HashSet<>();
        for (String power : powers) {
            this.superpowers.add(power);
        }
    }

    public Set<String> getSuperpowers(){
        return Collections.unmodifiableSet(superpowers);
    }

    public void addSuperpower(String... power){
        for (String s : power) {
            this.superpowers.add(s);
        }
    }

    /*    public Hero(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return Objects.equals(name, hero.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }*/
}
