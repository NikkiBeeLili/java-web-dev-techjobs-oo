package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {



    private String name;
    private String employer;
    private String location;
    private String positionType;
    private String coreCompetency;
    private int id;
    private static int nextId = 1;
    private String value;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;

        this.id = id;
        this.nextId = nextId;
    }
    public Job(String aValue){
        this();
        this.value = aValue;


    }

    public Job(String name, String employer, String location, String positionType, String coreCompetency, Integer id) {



        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
        this.id = nextId;




    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    //TDD Part

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId() &&
                getName().equals(job.getName()) &&
                getEmployer().equals(job.getEmployer()) &&
                getLocation().equals(job.getLocation()) &&
                getPositionType().equals(job.getPositionType()) &&
                getCoreCompetency().equals(job.getCoreCompetency());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getEmployer(), getLocation(), getPositionType(), getCoreCompetency());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(String coreCompetency) {
        this.coreCompetency = coreCompetency;
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
}
