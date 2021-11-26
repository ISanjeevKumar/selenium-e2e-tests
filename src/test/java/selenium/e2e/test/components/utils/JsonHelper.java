package selenium.e2e.test.components.utils;

import java.io.File;
import java.util.HashMap;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonHelper {

    public static Object[][] getJsonDataIntoArray(String file) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File from = new File(file);
            TypeReference<HashMap<String, Object>> typeRef = new TypeReference<HashMap<String, Object>>() {
            };
            HashMap<String, Object> mapData;
            mapData = mapper.readValue(from, typeRef);
            return mapData.entrySet().stream().map(e -> new Object[] { e.getKey(), e.getValue() })
                    .toArray(Object[][]::new);

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
