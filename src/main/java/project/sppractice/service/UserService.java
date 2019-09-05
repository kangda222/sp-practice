package project.sppractice.service;

import project.sppractice.model.User;

import java.util.List;

public interface UserService {

    public User addUser(User user) throws Exception;

    public List<User> getAllUser() throws Exception;

    public User getUserByName(String name) throws Exception;
}
