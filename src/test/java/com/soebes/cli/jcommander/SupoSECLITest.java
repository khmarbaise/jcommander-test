package com.soebes.cli.jcommander;

import org.testng.annotations.Test;

import com.soebes.cli.jcommander.SupoSECLI;

/**
 * Unit test for simple App.
 */
public class SupoSECLITest {

    @Test
    public void testWithoutArgumentsInSupoSECLI() {
        String[] args = { };
        SupoSECLI cli = new SupoSECLI();
        cli.run(args);
    }
}
