package builder;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void userTest() {
        User user = User.builder()
                .id(1L)
                .name("hyuk")
                .email("pjh08123@naver.com")
                .password("1234#")
                .build();

        System.out.println(user);
    }

}
