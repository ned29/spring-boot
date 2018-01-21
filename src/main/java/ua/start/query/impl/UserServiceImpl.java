package ua.start.query.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.model.User;
import ua.start.query.TypeRepository;
import ua.start.query.UserRepository;
import ua.start.query.UserService;

import java.util.List;

@Component
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

//    @Override
//    public List<User> findByLogin(String login) {
//        return userRepository.findByAttribute(login);
//    }
}
