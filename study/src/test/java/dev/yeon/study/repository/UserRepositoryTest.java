package dev.yeon.study.repository;

import dev.yeon.study.StudyApplicationTests;
import dev.yeon.study.model.entity.Item;
import dev.yeon.study.model.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    // DI = Dependency Injection 의존성 주입
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        // String sql = insert into user (%s, %s, %d) value (account, email, age);
        User user = new User();

        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-1111-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("admin3");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);
    }

    @Test
    @Transactional
    public void read(){
        Optional<User> user = userRepository.findById(1L);

        user.ifPresent(selectUser -> {

            selectUser.getOrderDetailList().stream().forEach(detail -> {
                Item item = detail.getItem();
                System.out.println(item);
            });
        });
    }

    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser -> {
            selectUser.setAccount("PPPP");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });

    }

    @Test
    @Transactional  // Rollback
    public void delete(){
        Optional<User> user = userRepository.findById(1L);

        Assertions.assertTrue(user.isPresent());  // true

        user.ifPresent(selectUser -> {
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(1L);

        Assertions.assertFalse(deleteUser.isPresent()); // false
    }
}
