package pl.lg.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    private UserRepository userRepository;

    @Before
    public void beforeTest() {
        userRepository = new UserRepository();
    }

    //Testowanie gdy nie mamy użytkownika
    @Test
    public void givenSomeUser_whenCreateUser_thenPresentInRepository() {
        String username = "kajko";
        String firstName = "Kajko";

        userRepository.createUser(username, firstName);

        User user = userRepository.getUser(username); //tak się testuje repozytoria w Spring !!!
        assertNotNull(user);
        assertEquals(user.getUserName(), username);
        assertEquals(user.getFirstName(), firstName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenUserWithExistingUsername_whenCreateUser_thenThrowException() {
        String username = "kajko";
        String firstName ="Kajko";

        userRepository.createUser(username, firstName);
    }
}