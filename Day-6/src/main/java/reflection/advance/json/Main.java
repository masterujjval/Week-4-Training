package reflection.advance.json;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        JSONParser ob1=new JSONParser();
        ob1.data="\"username\": \"ujjwal gupta\"";
        ob1.message="\"role\":\"admin\"\"";

        Class<?>cls=ob1.getClass();
        JSON json=new JSON();
        json.helper(cls,ob1);
    }
}
