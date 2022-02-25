import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    /*
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
    }

    @Test
    public void getLinks1() throws IOException{
        List<String> expect = List.of("https://something.com", "some-page.html");
        Path fileName = Path.of("test-file.md");
        String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    } */
    @Test
    public void getLinks8() throws IOException{
        List<String> expect = List.of("`google.com","google.com","ucsd.edu");
        Path fileName = Path.of("snippet-1.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks9() throws IOException{
        List<String> expect = List.of("a.com","a.com(())","example.com");
        Path fileName = Path.of("snippet-2.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    @Test
    public void getLinks10() throws IOException{
        List<String> expect = List.of("https://www.twitter.com","https://ucsd-cse15l-w22.github.io/","https://cse.ucsd.edu");
        Path fileName = Path.of("snippet-1.md");
	    String contents = Files.readString(fileName);
        assertEquals(expect, MarkdownParse.getLinks(contents));
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
