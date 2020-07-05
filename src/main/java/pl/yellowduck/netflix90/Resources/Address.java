package pl.yellowduck.netflix90.Resources;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Address {
    protected String street;
    protected int no;
    protected String city;
    protected String postCode;
    protected String country;
}
