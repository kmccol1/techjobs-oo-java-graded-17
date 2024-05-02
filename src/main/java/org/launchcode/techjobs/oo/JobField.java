package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField
{
    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    public JobField(String aValue)
    {
        this();
        this.value = aValue;
        //this.id = new Location().getId();
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public boolean equals(JobField aJob)
    {
        return this.getId() == aJob.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}
