package ua.start.query.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.query.UserRepository;

@Service
@Transactional
public class UserServiceImpl{

    @Autowired
    private UserRepository userRepository;

    public String findByLogin(@Param("login") String login) {
        return userRepository.findByLogin(login);
    }
}
