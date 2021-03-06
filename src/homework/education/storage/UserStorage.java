package homework.education.storage;

import homework.education.exception.UserNotFoundException;
import homework.education.model.User;


public class UserStorage {
    private User[] users = new User[10];
    int size;

    public void add(User user) {
        if (size == users.length)
            extend();
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, users.length);
        users = tmp;
    }


    public User getByEmail(String email) throws UserNotFoundException {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email))
                return users[i];
        }
        throw new UserNotFoundException("Էլ․փոստը գոյություն չունի" + email);
    }

}
