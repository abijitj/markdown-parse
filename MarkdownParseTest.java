import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    
    @Test
    public void testGetLinks(){
        ArrayList<String> expected = new ArrayList<>(); 
        assertEquals("Tests when there are no links", expected, MarkdownParse.getLinks("test2.md")); 

        ArrayList<String> expected2 = new ArrayList<>();
        expected2.add("https://www.newlink.com"); 
        expected2.add(" ");

        try {
            assertEquals("When there is one link and one ()[ ]", 
            expected2, MarkdownParse.getLinks(Files.readString(Path.of("test.md"))));
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        try {
            assertEquals(expected2, MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }

    /*
    public void testPrint(){
        ArrayList<String> expected2 = new ArrayList<>();
        expected2.add("https://www.newlink.com"); 
        expected2.add(" ");
 
        assertPrint("[https://www.newlink.com, ]", System.out.println(expected2));
    }
    */
}
