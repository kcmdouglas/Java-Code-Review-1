import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/results.vtl");

      String userString = request.queryParams("stringFormInput");
      model.put("userString", userString);

      String puzzleResult = wordPuzzle(userString);
      model.put("puzzleResult", puzzleResult);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String wordPuzzle(String userInput) {

    String newString = userInput.replaceAll("(?i)[aeiou]", "-");

    return newString;
  }
}
