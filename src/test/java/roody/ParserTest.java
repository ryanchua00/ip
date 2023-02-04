package roody;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParserTest {
    @Test
    public void testParse_singleInput() {
        String[] commands = Parser.parse("todo dinner");
        assertEquals("todo", commands[0]);
        assertEquals("dinner", commands[1]);
    }

    // To be achived in later implementations
    /*
    @Test
    public void testParse_multipleInputs() {
        String[] commands = Parser.parse("todo dinner tonight");
        assertEquals("todo", commands[0]);
        assertEquals("dinner tonight", commands[1]);
    }
     */
}
