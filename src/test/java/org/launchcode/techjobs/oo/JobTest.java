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
}
