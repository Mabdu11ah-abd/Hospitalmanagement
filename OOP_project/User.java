public class User {

    private String username;
    private String password;
      // Admin, Doctor ,Patient

    public User(String username, String password) {
        setUsername(username);
        setPassword(password);

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    // Method to authenticate the user
    public boolean login(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful. Welcome, " + username + "!");
            return true;
        } else {
            System.out.println("Invalid username or password. Please try again.");
            return false;
        }
    }

    //Method to logout.
    public void logout() {
        System.out.println("Logging out. Goodbye, " + username + "!");
    }
}
