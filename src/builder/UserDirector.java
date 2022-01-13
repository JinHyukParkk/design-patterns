package builder;

public class UserDirector {

    private UserBuilder userBuilder;

    public UserDirector(UserBuilder userBuilder) {
        this.userBuilder = userBuilder;
    }

    public User hyukUser() {
        return userBuilder.id(1L)
                .email("test@gmail.com")
                .name("hyuk")
                .password("1234")
                .getUser();
    }
}
