package edu.ucsb.pconrad.jgrade5.example;


import static com.github.tkutcher.jgrade.gradedtest.GradedTestResult.HIDDEN;
import static com.github.tkutcher.jgrade.gradedtest.GradedTestResult.VISIBLE;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.github.tkutcher.jgrade.gradedtest.GradedTest;

import org.junit.jupiter.api.Test;


public class ExampleGradedTests {
    @Test
    @GradedTest(name="True is true", points=2.0, visibility=VISIBLE)
    public void trueIsTrue() {
        assertTrue(true);
    }

    @Test
    @GradedTest(name="False is false", number="2", points=3.0, visibility=HIDDEN)
    public void falseIsFalse() {
        assertFalse(false);
    }

    @Test
    @GradedTest(name="Captures output")
    public void capturesOutput() {
        System.out.println("hello");
    }

    @Test
    @GradedTest(name="This test should fail")
    public void badTest() {
        fail();
    }
}