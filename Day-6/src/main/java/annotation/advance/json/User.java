package annotation.advance.json;



public class User {

    @JsonField(name = "user_name")  // Custom JSON key for username
    private String username;

    @JsonField(name = "user_age")  // Custom JSON key for age
    private int age;

    // Constructor
    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Getter methods
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
}
