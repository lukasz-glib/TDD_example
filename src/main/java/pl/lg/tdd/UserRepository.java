package pl.lg.tdd;

import java.util.HashSet;
import java.util.Set;

public class UserRepository {

    private Set<User> users = new HashSet<>();

    public User getUser (String username) {
        for (User user : users) {
            if (user.getUserName().equals(username)) {
                return user;
            }
        }
        return null;
    }


    public User createUser(String username, String firstName) {
        User user = new User(username, firstName);
        if (users.contains(user)) {
            throw new IllegalArgumentException("Użytkownik " + username + " już istnieje");
        }
        users.add(user);
        return user;
    }

    public void updateUser(User user) {

    }

    public void deleteUser(User user) {

    }
}
