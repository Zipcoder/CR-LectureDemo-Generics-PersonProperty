package com.zipcodewilmington.person.generic;

import java.awt.*;
import java.util.Date;

/**
 * Created by leon on 3/8/18.
 */
public class GenericPerson<T> {
    public final Container<String> name;
    public final Container<Date> birthdate;
    public final Container<Color> eyeColor;
    public final Container<Integer> socialSecurityNumber;

    public GenericPerson(String name, Date birthdate, Color eyeColor, Integer socialSecurityNumber) {
        this.name = new Container<>(name);
        this.birthdate = new Container<>(birthdate);
        this.eyeColor = new Container<>(eyeColor);
        this.socialSecurityNumber = new Container<>(socialSecurityNumber);
    }
}
