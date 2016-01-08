
import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  // @Test
  // public void wordPuzzle_shouldIntakeStringOutputString_stringReturn() {
  //   App app = new App();
  //   String result = "I'm writing a string!";
  //   assertEquals(result, app.wordPuzzle("I'm writing a string!"));
  // }

  // @Test
  // public void wordPuzzle_shouldReplaceAWithDash_lDASHzy() {
  //   App app = new App();
  //   String result = "The quick brown fox jumps over the l-zy dog.";
  //   assertEquals(result, app.wordPuzzle("The quick brown fox jumps over the lazy dog."));
  // }

  @Test
  public void wordPuzzle_shouldReplaceAllLowerVowels_lowerCaseToDashes() {
    App app = new App();
    String result = "El-g-ntly, th- q--ck br-wn f-x j-mps -v-r th- l-zy d-g.";
    assertEquals(result, app.wordPuzzle("Elegantly, the quick brown fox jumps over the lazy dog."));
  }
}
