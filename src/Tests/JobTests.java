package Tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;
import static org.junit.Assert.assertTrue;


public class JobTests {

    Job android_developer;
    Job ios_engineer;
    Job road_runner;
    Job missing_DataJob;
    Job ios_engineer_missing_Location;
    
    @Before
    public void setup(){
        android_developer = new Job("Android Developer", new Employer("Float Left Interactive"),new Location("South Florida"), new PositionType("Mobile Developer"), new CoreCompetency("Android"));
        ios_engineer = new Job("IOS Engineer", new Employer ("Utrip"), new Location("Seattle"), new PositionType("Mobile Developer"), new CoreCompetency ("iOS"));
        road_runner = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        missing_DataJob = new Job();
        ios_engineer_missing_Location = new Job("IOS Engineer", new Employer ("Utrip"), new Location(""), new PositionType("Mobile Developer"), new CoreCompetency ("iOS"));
    }



    @Test
    public void testSettingJobId(){
        assertEquals(1, ios_engineer.getId() - android_developer.getId());

    }

    @Test

    public void testJobConstructorSetsAllFields(){


        assertTrue(road_runner.getName().equals((String) road_runner.getName()));
        assertEquals("ACME", road_runner.getEmployer().getValue());
        assertTrue(road_runner.getEmployer() instanceof Employer );
        assertEquals("Desert", road_runner.getLocation().getValue());
        assertTrue(road_runner.getLocation() instanceof Location);
        assertEquals("Quality control", road_runner.getPositionType().getValue());
        assertTrue(road_runner.getPositionType() instanceof PositionType);
        assertEquals("Persistence", road_runner.getCoreCompetency().getValue());
        assertTrue(road_runner.getCoreCompetency() instanceof CoreCompetency);


    }
    @Test
    public void testJobsForEquality() {
        Job job_1;
        Job job_2;
        job_1= new Job("Cemetery Ghost", new Employer ( "Self-employed"), new Location("Prague"), new PositionType ("Project Management"), new CoreCompetency("spooky"));
        job_2= new Job("Biocentric Data Tester", new Employer ("LanzaTech"), new Location("New York"), new PositionType ("Data analysis"), new CoreCompetency ("School of Life, Quantum Physics"));
       assertTrue(!(job_1.equals(job_2)));
    }



    //toString Tests
    @Test
     public void shouldReturnStringWithLineBeforeAndAfterInfo(){

        String Output = String.format("\nID: " + ios_engineer.getId()  + "\nName: " + ios_engineer.getName() + "\nEmployer: " + ios_engineer.getEmployer()
                + "\nLocation: " + ios_engineer.getLocation()  +"\nPosition Type: " + ios_engineer.getPositionType() + "\nCore Competency: " + ios_engineer.getCoreCompetency() + "\n");
        assertEquals(Output, ios_engineer.toString());


    }



    @Test

    public void shouldContainErrorMessageForEmptyField(){
        assertTrue(missing_DataJob.toString().equals("Oops! This job doesn't seem to exist."));
        String Output = String.format("\nID: " + ios_engineer_missing_Location.getId()  + "\nName: " + ios_engineer_missing_Location.getName() + "\nEmployer: " + ios_engineer_missing_Location.getEmployer()
                + "\nLocation: Data not available"  +"\nPosition Type: " + ios_engineer_missing_Location.getPositionType() + "\nCore Competency: " + ios_engineer_missing_Location.getCoreCompetency() + "\n");
        assertEquals(Output, ios_engineer_missing_Location.toString());

    }

    }


