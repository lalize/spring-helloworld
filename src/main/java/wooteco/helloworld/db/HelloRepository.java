package wooteco.helloworld.db;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import wooteco.helloworld.domain.Hello;

public interface HelloRepository extends CrudRepository<Hello, Long> {
    @Query("SELECT COUNT(1) FROM hello WHERE name = :name")
    int countByName(@Param("name") String name);
}
