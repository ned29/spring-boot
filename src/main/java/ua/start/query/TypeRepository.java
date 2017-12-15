package ua.start.query;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TypeRepository<T> extends CrudRepository<T, Long> {

    @Query("select t from #{#entityName} t where t.attribute =?1")
    List<T> findByAttribute(String attribute) throws IllegalArgumentException;
}
