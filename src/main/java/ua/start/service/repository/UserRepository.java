package ua.start.service.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.start.model.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    @Query("FROM User where login like %?1% ")
    String findByLogin(String login);
}
