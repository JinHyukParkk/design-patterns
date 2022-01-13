package builder;

import org.junit.jupiter.api.Test;

class DefaultUserBuilderTest {

    @Test
    void builderTest() {
        UserBuilder builder = new DefaultUserBuilder();
        User user = builder.id(1L)
                .email("test@gmail.com")
                .name("hyuk")
                .password("1234")
                .getUser();

        System.out.println(user);
    }

    @Test
    void directorTest() {
        UserDirector director = new UserDirector(new DefaultUserBuilder());
        User user = director.hyukUser();

        System.out.println(user);
    }
}
