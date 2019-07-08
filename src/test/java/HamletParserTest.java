import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        // Arrange
        String expected = hamletParser.loadFile("leon.txt");

        // Act
        String actual = hamletParser.changeHamlet("Leon");

        // Assert
        assertEquals(expected, actual);
        assertNotEquals(expected,hamletParser.getHamletData());
    }

    @Test
    public void testChangeHoratioToTariq() {
        // Arrange
        String expected = hamletParser.loadFile("tariq.txt");

        // Act
        String actual = hamletParser.changeHoratio("Tariq");

        // Assert
        assertNotEquals(expected, hamletParser.getHamletData());
        assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }
}