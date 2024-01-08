package de.hof_University;

import de.hof_University.ing.*;
import de.hof_University.inf.*;
public class Uni {
    @Override
    public String toString() {
        return new JavaGrundlagen().toString()
                + System.lineSeparator()
                + new Statik().toString();
    }
}
