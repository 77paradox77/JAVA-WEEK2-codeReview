import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class dictionaryTest {

  @Test
  public void getWord_thisWillPromptForWordEntry_true() {
    Dictionary testDictionary = new Dictionary("Test for Dictionary element");
    assertEquals(true, testDictionary instanceof Dictionary);
  }

  @Test
  public void getWord_thisWillPromptForUserToEnterAWord_word() {
    Dictionary testDictionary = new Dictionary("Please Enter your word");
    assertEquals("word", testDictionary.getWord());
  }


  @Test
  public void getDefinition_thisWillPromptUserToEnterADefinition_definition() {
    Dictionary testDictionary = new Dictionary("Please Enter your Definition");
    assertEquals("Definition", testDictionary.getDefinition());
  }
}
