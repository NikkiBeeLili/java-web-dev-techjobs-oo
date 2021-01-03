package org.launchcode.techjobs_oo;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Job {



    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private int id;
    private static int nextId = 1;
    //private String value;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;


        this.id = id;
        this.nextId = nextId;
    }
    //public Job(String aValue){
        //this();
        //this.value = aValue;


    //}

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {


        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;





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



    @Override
    public String toString() {
        String OutputTest = "";
        if (name == null && employer == null && location== null && positionType == null && coreCompetency == null) {
            return "Oops! This job doesn't seem to exist.";

        }

        else if (name.equals("")) {
            name="Data not available" ;
        }

        else if (employer.getValue().equals("")) {
            employer.setValue("Data not available") ;
        }
        else if (location.getValue().equals("")) {
            location.setValue("Data not available");
        }
       else if (positionType.getValue().equals("")) {
           positionType.setValue("Data not available");
       }
        else if (coreCompetency.getValue().equals("")) {
            coreCompetency.setValue("Data not available");
        }

        OutputTest = String.format("\nID: " + id + "\nName: " + name + "\nEmployer: "
                + employer + "\nLocation: " + location
                + "\nPosition Type: " + positionType
                + "\nCore Competency: " + coreCompetency + "\n");

        return OutputTest;


        //return "\nID: " + id + "\nName: " + name + "\nEmployer: "
               // + employer + "\nLocation: " + location
                //+ "\nPosition Type: " + positionType
              //  + "\nCore Competency: " + coreCompetency + "\n";

    }








    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
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

    public void  setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }


        //for (Job) {
           // System.out.println("\n__________\n" + name.toString() + "\n________\n" + employer.getValue().toString() + "\n__________\n" +
                   // location.getValue().toString() + "\n__________\n" + positionType.getValue().toString() + "\n__________\n" + coreCompetency.getValue().toString() +
                   // "\n__________\n" + getId() + "\n__________\n");
       // }

        //else {

  //  }

    //public String getValue() {
        //return value; }

  // public void setValue(String value) {
       // this.value = value;
   // }
}
