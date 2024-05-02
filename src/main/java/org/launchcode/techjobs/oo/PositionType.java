package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    public String toString()
    {
        return this.value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    public boolean equals(PositionType aType)
    {
        return this.getId() == aType.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value);
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
