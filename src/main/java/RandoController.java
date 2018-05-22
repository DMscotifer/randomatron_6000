import spark.ModelAndView;
import spark.SparkBase;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class RandoController {

    public static void main(String[] args) {

//        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();
//
//        SparkBase.staticFileLocation("/public");

        get("/name/random", (req, res) -> {
            ArrayList<String> name;
            name = new ArrayList<>();
            name.add("Scott");
            name.add("John");
            name.add("Alex");
            name.add("William");
            int rnd = new Random().nextInt(name.size());
            return name.get(rnd);
            });

        get("/name/random/pair", (req, res) -> {
//
//            staticFileLocation("/public");

            ArrayList<String> names;
            names = new ArrayList<>();
            names.add("Scott");
            names.add("John");
            names.add("Alex");
            names.add("William");

            int rnd1 = new Random().nextInt(names.size());
            int rnd2 = new Random().nextInt(names.size());
            while (names.get(rnd1).equals(names.get(rnd2))) {
                rnd2 = new Random().nextInt(names.size());
            }
            return names.get(rnd1) + " and " + names.get(rnd2);
            });
    }

}
