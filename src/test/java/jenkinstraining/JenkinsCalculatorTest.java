package jenkinstraining;

import org.example.JenkinsCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JenkinsCalculatorTest {

    @Test
    public void addNumbers() {
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(10,myCalc.addNumbers(5,5));
    }

    @Test
    public void subtractNumbers() {
        JenkinsCalculator myCalc = new JenkinsCalculator();
        assertEquals(5,myCalc.subtractNumbers(10,5));
    }
}