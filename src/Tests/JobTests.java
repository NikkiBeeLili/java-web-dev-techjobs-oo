package Tests;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.launchcode.techjobs_oo.Job;
import org.junit.After;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTests {

    Job android_developer;
    Job ios_engineer;
    
    @Before
    public void setup(){
        android_developer = new Job("Android Developer","Float Left Interactive","South Florida","Mobile Developer","Android", 1 );
        ios_engineer = new Job("IOS Engineer","Utrip","Seattle","Mobile Developer","iOS", 2 );
    }

    @Test
    public void testSettingJobId(){
        assertEquals(1, ios_engineer.getId() - android_developer.getId());

    }
    //@Test //Patterns of instanceof not recognized at language level sdk 13
   // public void testJobConstructorSetsAllFields(){
        //Job road_runner;
        //road_runner = new Job("Product tester", "ACME", "Desert", "Quality control", "Persistence", 1);
        //assertTrue("Product tester" instanceof Class name);
        //assertTrue("ACME" instanceof Class employer);
        //assertTrue("Quality control" instanceof Class positionType);
        //assertTrue("Persistence" instanceof Class coreCompetency);
       // assertEquals(id=1, id=road_runner.getId());

    //}
    @Test
    public void testJobsForEquality() {
        Job job_1;
        Job job_2;
        job_1= new Job("Cemetery Ghost", "Self-employed", "Prague", "Project Management", "spooky", 3);
        job_2= new Job("Biocentric Data Tester", "LanzaTech", "New York", "Data analysis", "School of Life, Quantum Physics", 4);
       assertFalse(job_1.getId() == job_2.getId());
    }

    //Test objects do not generate ids based on the one before.

}
