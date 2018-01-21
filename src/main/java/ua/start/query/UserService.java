package ua.start.query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.start.model.User;

import java.util.List;

@Service
@Transactional
public interface UserService {
   // List<User> findByLogin(String login);
}
