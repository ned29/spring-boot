package ua.start.service;

import org.springframework.data.repository.query.Param;

public interface UserService {

    String findByLogin(@Param("login") String login);
}
