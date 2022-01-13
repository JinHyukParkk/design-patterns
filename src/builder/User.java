package builder;

public class User {

    private Long id;

    private String email;

    private String name;

    private String password;

    public User(Long id, String email, String name, String password) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    static class UserBuilder {
        private Long id;
        private String email;
        private String name;
        private String password;

        UserBuilder id(Long id) {
            this.id = id;
            return this;
        }

        UserBuilder email(String email) {
            this.email = email;
            return this;
        }

        UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        UserBuilder password(String password) {
            this.password = password;
            return this;
        }

        User build() {
            return new User(id, email, name, password);
        }
    }
}
