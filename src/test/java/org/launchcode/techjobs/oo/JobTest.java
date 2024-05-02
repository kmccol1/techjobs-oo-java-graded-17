package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class JobTest
{
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId()
    {
        //assertFalse(false);
        Job fullTimeJob = new Job();
        Job secondJob = new Job();

        assertNotEquals(fullTimeJob.getId(), secondJob.getId());
    }
}
