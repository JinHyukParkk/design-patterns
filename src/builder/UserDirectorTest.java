package builder;

import org.junit.jupiter.api.Test;

class UserDirectorTest {

    @Test
    void directorTest() {
        UserDirector userDirector = new UserDirector(new DefaultUserBuilder());

        User user = userDirector.hyukUser();

        System.out.println(user);
    }
}
