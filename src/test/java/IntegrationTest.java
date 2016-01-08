import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;

import org.junit.*;
import static org.junit.Assert.*;

public class IntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
    public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("");
    }

  @Test
    public void homePage() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("I'll give you a puzzle:");
    }

  @Test
    public void resultsPage() {
      goTo("http://localhost:4567/");
      fill("#stringFormInput").with("Here's my string!");
      submit(".btn-info");
      assertThat(pageSource()).contains("Now here's your sentence as a ~SuPeR MyStErIoUs PuZzLe~ :");
    }

  @Test
    public void stringResult() {
      goTo("http://localhost:4567/");
      fill("#stringFormInput").with("Here's my string!");
      submit(".btn-info");
      assertThat(pageSource()).contains("H-r-'s my str-ng!");
    }
}
