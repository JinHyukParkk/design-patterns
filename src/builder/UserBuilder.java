package builder;

public interface UserBuilder {

    UserBuilder id(Long id);

    UserBuilder email(String email);

    UserBuilder name(String name);

    UserBuilder password(String password);

    User getUser();
}
