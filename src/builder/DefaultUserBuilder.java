package builder;

public class DefaultUserBuilder implements UserBuilder{

    private Long id;

    private String email;

    private String name;

    private String password;

    @Override
    public UserBuilder id(Long id) {
        this.id = id;
        return this;
    }

    @Override
    public UserBuilder email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public User getUser() {
        return new User(id, email, name, password);
    }
}
