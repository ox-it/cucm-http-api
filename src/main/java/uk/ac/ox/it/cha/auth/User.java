package uk.ac.ox.it.cha.auth;

/**
 *
 * @author martinfilliau
 */
public class User {

    private String username;
    private String password;

    public User(String username) {
        this.username = username;
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
}
