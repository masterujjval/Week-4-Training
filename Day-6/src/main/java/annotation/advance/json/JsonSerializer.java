package annotation.advance.json;


import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

    public static String toJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Map<String, Object> jsonMap = new HashMap<>();

        // Iterate over all declared fields in the class
        for (Field field : clazz.getDeclaredFields()) {
            // Check if the field is annotated with @JsonField
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);  // Make private fields accessible

                // Get the annotation and the custom JSON name
                JsonField jsonField = field.getAnnotation(JsonField.class);
                String jsonName = jsonField.name();
                Object value = field.get(obj);  // Get the field value

                // Add to map with the custom key (JSON name)
                jsonMap.put(jsonName, value);
            }
        }

        // Convert the map to a JSON-like string (simplified version)
        StringBuilder jsonString = new StringBuilder("{");
        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
            jsonString.append("\"").append(entry.getKey()).append("\": \"")
                    .append(entry.getValue()).append("\", ");
        }

        // Remove trailing comma and space, and close the JSON object
        if (jsonString.length() > 1) {
            jsonString.delete(jsonString.length() - 2, jsonString.length());
        }
        jsonString.append("}");

        return jsonString.toString();
    }
}
