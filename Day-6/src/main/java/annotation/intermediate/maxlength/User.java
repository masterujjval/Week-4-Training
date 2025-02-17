package annotation.intermediate.maxlength;

public class User {

    @MaxLength(10)  // Apply the annotation with a max length of 10
    private String username;

    // Constructor to validate the username
    public User(String username) {
        this.username = username;

        // Validate the length of the username using reflection
        validateLength();
    }

    // Method to validate the field length using reflection
    private void validateLength() {
        // Get the field
        try {
            // Get the field with @MaxLength annotation
            MaxLength maxLengthAnnotation = this.getClass().getDeclaredField("username").getAnnotation(MaxLength.class);
            if (maxLengthAnnotation != null) {
                int maxLength = maxLengthAnnotation.value();

                // Check if the username exceeds the max length
                if (username.length() > maxLength) {
                    throw new IllegalArgumentException("Username exceeds the maximum length of " + maxLength);
                }
            }
        } catch (NoSuchFieldException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getUsername() {
        return username;
    }
}
