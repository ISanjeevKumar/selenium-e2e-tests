package selenium.e2e.test.components.utils;

import java.io.File;
import java.util.HashMap;


import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonHelper {

    public static Object[][] getJsonDataIntoArray(String file) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File from = new File(file);
            Userdata[] langs = mapper.readValue(from, Userdata[].class);
            System.out.println("size:"+langs.length);
            Object[][] jsonData = new Object[langs.length][2];
            for (int i = 0; i < langs.length; i++){
                jsonData[i][0] = langs[i].username;
                jsonData[i][1] = langs[i].password;
            }
            return jsonData;

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
