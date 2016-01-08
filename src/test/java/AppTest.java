
import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void wordPuzzle_shouldIntakeStringOutputString_stringReturn() {
    App app = new App();
    String result = "I'm writing a string!";
    assertEquals(result, app.wordPuzzle("I'm writing a string!"));
  }
}
