package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job()
    {
        id = nextId;
        nextId++;
    }

    public Job(String aName, Employer anEmployer, Location aLocation, PositionType aType, CoreCompetency aCompetency)
    {
        this();
        this.name = aName;
        this.employer = anEmployer;
        this.location = aLocation;
        this.positionType = aType;
        this.coreCompetency = aCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public boolean equals(Job aJob)
    {
        return this.getId() == aJob.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
    //TODO: Fix toString below to make ALL tests pass.
    @Override
    public String toString()
    {
        String result;
        try
        {
            result = "\nJob{" +
                    "id=" + this.id +
                    ", name='" + this.name + '\'' +
                    ", employer=" + this.employer.toString() +
                    ", location=" + this.location.toString() +
                    ", positionType=" + this.positionType.toString() +
                    ", coreCompetency=" + this.coreCompetency.toString() +
                    '}' + '\n';
        }
        catch (NullPointerException anException)
        {
            result = "\nJob{" +
                    "id=" + this.id +
                    ", name='" + this.name + '\'' +
                    ", employer=" + "Data not available" +
                    ", location=" + "Data not available" +
                    ", positionType=" + "Data not available" +
                    ", coreCompetency=" + "Data not available" +
                    '}' + '\n';
        }

        return result;
    }
}
