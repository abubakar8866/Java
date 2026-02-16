package files;

import java.io.Serializable;

class User2 implements Serializable {

    private static final long serialVersionUID = 1L;

    String username;
    int age;

    public User2(String username, int age) {
        this.username = username;
        this.age = age;
    }

    // Validation method
    public boolean isValid() {
        return username != null && !username.isEmpty()
                && age > 0 && age < 120;
    }

    @Override
    public String toString() {
        return "User: " + username + ", Age: " + age;
    }
}