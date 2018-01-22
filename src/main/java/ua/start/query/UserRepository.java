package ua.start.query;

import org.springframework.stereotype.Repository;
import ua.start.model.User;

@Repository
public interface UserRepository extends TypeRepository<User> {
}
