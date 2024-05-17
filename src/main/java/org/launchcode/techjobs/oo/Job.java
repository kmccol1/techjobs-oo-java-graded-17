package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job extends JobField {

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
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
        StringBuilder result = new StringBuilder();
        result.append("\nID: ");

        if (this.id >= 0)
        {
            result.append(this.getId());
        }

        try
        {
            if (!this.getName().isEmpty())
            {
                result.append("\nName: ").append(this.getName());
            }
            else
            {
                result.append("\nName: ").append("Data not available");
            }
        }
        catch(NullPointerException e)
        {
            result.append("\nName: ").append("Data not available");
        }

        try
        {
            if (!this.getEmployer().getValue().isEmpty())
            {
                result.append("\nEmployer: ").append(this.getEmployer());
            }
            else
            {
                result.append("\nEmployer: ").append("Data not available");
            }
        }
        catch(NullPointerException e)
        {
            result.append("\nEmployer: ").append("Data not available");
        }


        try
        {
            if (!this.getLocation().getValue().isEmpty())
            {
                result.append("\nLocation: ").append(this.getLocation());
            }
            else
            {
                result.append("\nLocation: ").append("Data not available");
            }
        }
        catch(NullPointerException e)
        {
            result.append("\nLocation: ").append("Data not available");
        }


        try
        {
            if (!this.getPositionType().getValue().isEmpty())
            {
                result.append("\nPosition Type: ").append(this.getPositionType());
            }
            else
            {
                result.append("\nPosition Type: ").append("Data not available");
            }
        }
        catch(NullPointerException e)
        {
            result.append("\nPosition Type: ").append("Data not available");
        }

        try
        {
            if (!this.getCoreCompetency().getValue().isEmpty())
            {
                result.append("\nCore Competency: ").append(this.getCoreCompetency());
            }
            else
            {
                result.append("\nCore Competency: ").append("Data not available");
            }
        }
        catch(NullPointerException e)
        {
            result.append("\nCore Competency: ").append("Data not available");
        }



        result.append("\n");
        //try...how to test if job fields exist/contains a value in Java?
        //if(!this.getEmployer().getValue().isEmpty())
//        try
//        {
//            if(!this.getEmployer().getValue().isEmpty())
//            {
//                result = "\nID: " + this.id +
//                        "\nName: " + this.name +
//                        "\nEmployer: " + this.employer.toString() +
//                        "\nLocation: " + this.location.toString() +
//                        "\nPosition Type: " + this.positionType.toString() +
//                        "\nCore Competency: " + this.coreCompetency.toString() + '\n';
//            }
//            else
//            {
//                result = "\nID: " + this.id +
//                        "\nName: " + this.name +
//                        "\nEmployer: " + "Data not available" +
//                        "\nLocation: " + this.location.toString() +
//                        "\nPosition Type: " + "Data not available" +
//                        "\nCore Competency: " + this.coreCompetency.toString() + '\n';
//            }
//        }
//        catch (NullPointerException anException)
//        {
//            result = "\nid=" + this.id +
//                    "\nname='" + this.name + '\'' +
//                    "\nemployer=" + "Data not available" +
//                    "\nlocation=" + "Data not available" +
//                    "\npositionType=" + "Data not available" +
//                    "\ncoreCompetency=" + "Data not available" + '\n';
//        }

        return result.toString();
    }
}
