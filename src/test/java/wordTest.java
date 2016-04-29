import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class wordTest {

// Probably WONT NEED RULE
  // @Rule
  // public ClearRule clearRule  = new ClearRule();

  @Test
  public void word_instantiatesWithDictionary_String() {
    Word testDictionary = new Word("Planet");
    assertEquals(true, testDictionary instanceof Word);
  }


  @Test
  public void getWord_thisWillPromptForUserToEnterAWord_String() {
    Word testDictionary = new Word("Planet");
    assertEquals("Planet", testDictionary.getWord());
  }

  @Test
  public void getMultipleWords_thisWillPromptForUserToEnterMultipleWords_String() {
    Word testDictionary = new Word("Planet");
    assertEquals("Planet", testDictionary.getWord());
  }


  // @Test
  // public void getDefinition_thisWillPromptUserToEnterADefinition_definition() {
  //   Word testDictionary = new Word("Please Enter your Definition");
  //   assertEquals("Definition", testDictionary.getDefinition());
  // }

  @Test
  public void newId_wordInstantiatesWithAnId_true() {
    Word testDictionary = new Word("Apple");
    assertEquals(Word.all().size(), testDictionary.getId());
  }
}
