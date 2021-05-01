package pos.saam.user;

import java.time.LocalDateTime;

public class User {
    private int id = -1;
    private String username;
    private String fullName;
    private String password;
    private boolean active;
    private boolean admin;
    private LocalDateTime addedOn;

    public User() {

    }
    public User(int id, String username, String fullName, String password, boolean active, boolean admin, String addedOn) {
        setId(id);
        setUsername(username);
        setFullName(fullName);
        setPassword(password);
        setActive(active);
        setAdmin(admin);
        setAddedOn(addedOn);
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    public void setAddedOn(String addedOn) {
        this.addedOn = LocalDateTime.parse(addedOn.replace(' ', 'T'));
    }

    public int getId() { return this.id; }
    public String getUsername() { return this.username; }
    public String getFullName() { return this.fullName; }
    public String getPassword() { return this.password; }
    public boolean isActive() { return this.active; }
    public boolean isAdmin() { return this.admin; }
    public LocalDateTime getAddedOn() { return this.addedOn; }
}
