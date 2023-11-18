public class User {
    private String Role;
    protected String name;
    protected String ID;
    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    private String password;
    // Admin, Doctor ,Patient

    public void RegisterUser(String username, String password,String ID, String Role) {
        setName(username);
        setPassword(password);
        setRole(Role);
        setID(ID);        
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to authenticate the user
    public boolean login(String enteredID, String enteredPassword) {
        if (enteredID.equals(ID) && enteredPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    // Method to logout.
    public void logout() {
        System.out.println("Logging out. Goodbye, " + name + "!");
    }
}
