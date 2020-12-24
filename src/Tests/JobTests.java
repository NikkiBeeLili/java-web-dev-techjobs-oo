package Tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
import org.launchcode.techjobs_oo.Job;
import org.junit.After;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTests {

    Job android_developer;
    Job ios_engineer;
    Job road_runner;
    
    @Before
    public void setup(){
        android_developer = new Job("Android Developer", new Employer("Float Left Interactive"),new Location("South Florida"), new PositionType("Mobile Developer"), new CoreCompetency("Android"));
        ios_engineer = new Job("IOS Engineer", new Employer ("Utrip"), new Location("Seattle"), new PositionType("Mobile Developer"), new CoreCompetency ("iOS"));
        road_runner = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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


    //Test objects do not generate ids based on the one before.

    //toString Tests
    //@Test
     //public void shouldReturnStringWithLineBeforeAndAfterInfo(){
        //assertTrue(Job_1.toString().equals("\n__________\n" + Job.getValue + "\n________\n").getId()
                //should print );
    //}

    //@Test

    //public void shouldContainLabelAndDataForEachField(){
       // assertTrue(//Job.toString()== Job.Class + Job.Value);
    //}

    //@Test

    //public void shouldContainErrorMessageForEmptyField(){
     //(if Job.value === null){
         //assertTrue(sout(“Data not available”));
   // }

    }

//}
