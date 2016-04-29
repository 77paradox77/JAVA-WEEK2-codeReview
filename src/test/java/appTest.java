import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;
import org.fluentlenium.adapter.FluentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Word List!");
  }

  @Test
  public void wordIsCreatedTest() {
    goTo("http://localhost:4567/");
    fill("#phrase").with("Cat");
    submit.(".btn");
    assertThat(pageSource()).contains("Your new Word has been saved.");
  }

  @Test
  public void wordIsDisplayedTest() {
    goTo("http://localhost:4567/");
    fill("#phrase").with("Cat");
    submit(".btn");
    click("a", withText("Go Back"));
    assertThat(pageSource()).contains("Mow the lawn");
}
}
