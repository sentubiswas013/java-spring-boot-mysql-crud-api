package tutorial.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorial.com.example.entity.User;
import tutorial.com.example.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public List<User> read() {
        return userRepository.findAll();
    }

    public Optional<User> readById(Integer id) {
        return userRepository.findById(id);
    }

    public User update(User user){
        return userRepository.save(user);
    }

    public void delete(Integer id){
        userRepository.deleteById(id);
    }

}
