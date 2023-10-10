class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class Q5 {
    private static final String VALID_USERNAME = "myuser";
    private static final String VALID_PASSWORD = "mypassword";

    public static void main(String[] args) {
        try {
            String inputUsername = "myuser";
            String inputPassword = "wrongpassword";

            validateCredentials(inputUsername, inputPassword);
            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.err.println("Invalid login credentials: " + e.getMessage());
        }
    }

    public static void validateCredentials(String username, String password) throws InvalidCredentialsException {
        if (!VALID_USERNAME.equals(username) || !VALID_PASSWORD.equals(password)) {
            throw new InvalidCredentialsException("Invalid username or password");
        }
    }
}
