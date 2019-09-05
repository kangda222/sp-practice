package project.sppractice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.sppractice.model.User;
import project.sppractice.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User addUser(User user) throws Exception {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() throws Exception {
        return userRepository.findAll();
    }

    @Override
    public User getUserByName(String name) throws Exception {
        return userRepository.findByName(name);
    }
}
