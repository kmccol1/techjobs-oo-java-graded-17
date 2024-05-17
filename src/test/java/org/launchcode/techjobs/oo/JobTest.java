package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest
{
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId()
    {
        Job fullTimeJob = new Job();
        Job secondJob = new Job();

        assertNotEquals(fullTimeJob.getId(), secondJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields()
    {
        Job fullTimeJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(fullTimeJob.getName(), "Product tester");
        assertEquals(fullTimeJob.getEmployer().getValue(), "ACME");
        assertEquals(fullTimeJob.getLocation().getValue(), "Desert");
        assertEquals(fullTimeJob.getPositionType().getValue(), "Quality control");
        assertEquals(fullTimeJob.getCoreCompetency().getValue(), "Persistence");

        assertTrue(fullTimeJob instanceof Job);
        assertTrue(fullTimeJob.getEmployer() instanceof Employer);
        assertTrue(fullTimeJob.getLocation() instanceof Location);
        assertTrue(fullTimeJob.getPositionType() instanceof PositionType);
        assertTrue(fullTimeJob.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality()
    {
        Job fullTimeJob = new Job();
        Job secondJob = new Job();

        assertFalse(fullTimeJob.equals(secondJob));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine()
    {
        Job fullTimeJob = new Job();

        assertEquals(fullTimeJob.toString().charAt(0),'\n');
        assertEquals(fullTimeJob.toString().charAt(fullTimeJob.toString().length() - 1),'\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData()
    {
        //fail();
        Job fullTimeJob = new Job("JobName", new Employer("employer"),  new Location("location"),new PositionType("position"), new CoreCompetency("skillz"));

        assertTrue(fullTimeJob.toString().contains("id=" + fullTimeJob.getId()));
        assertTrue(fullTimeJob.toString().contains("name='" + fullTimeJob.getName() + "'"));
        assertTrue(fullTimeJob.toString().contains("location="+ fullTimeJob.getLocation()));
        assertTrue(fullTimeJob.toString().contains("positionType="+ fullTimeJob.getPositionType()));
        assertTrue(fullTimeJob.toString().contains("coreCompetency="+ fullTimeJob.getCoreCompetency()));

    }

    @Test
    public void testToStringHandlesEmptyField()
    {
        //fail();
        Job fullTimeJob = new Job();

        assertTrue(fullTimeJob.toString().contains("id=" + fullTimeJob.getId()));
        assertTrue(fullTimeJob.toString().contains("name='" + fullTimeJob.getName() + "'"));
        assertTrue(fullTimeJob.toString().contains("location=Data not available"));
        assertTrue(fullTimeJob.toString().contains("positionType=Data not available"));
        assertTrue(fullTimeJob.toString().contains("coreCompetency=Data not available"));
    }
}
