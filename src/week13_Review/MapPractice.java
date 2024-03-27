package week13_Review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class MapPractice {
    public static void main(String[] args) {

        /*
        // step1: opening file
        String path = "src/week13_review/Configurations.properties";
        FileInputStream file = new FileInputStream(path);


        // step2: loading the properties
        Properties properties = new Properties();
        properties.load(file);

       // System.out.println( properties.getProperty("browser") );
     //   System.out.println(properties.stringPropertyNames());

        Map<String, String> map = new HashMap<>();

        for (String key : properties.stringPropertyNames()) {
            String value = properties.getProperty(key);
            map.put(key, value);
        }
*/

        Map<String, String> map = readPropertiesFile("src/week13_review/Configurations.properties");

        System.out.println(map);

        System.out.println(map.get("url"));
        System.out.println(map.get("username"));


        Map<String, String> map2 = readPropertiesFile("src/week13_review/Configurations2.properties");

        System.out.println(map2);


    }

    public static Map<String, String> readPropertiesFile(String path) {

        Map<String, String> map = new HashMap<>();

        try {
            FileInputStream file = new FileInputStream(path);

            Properties properties = new Properties();
            properties.load(file);

            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                map.put(key, value);
            }

        }catch (IOException e){

        }

        return map;
    }


}
