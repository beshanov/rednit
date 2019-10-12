package com.beko.rednit.dao;

import com.beko.rednit.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//no need to implement methods: save, findById, findAll, delete
//use @Query to customize repository methods
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "select * from users u where u.id = (select u_e.user_id from user_event u_e where u_e.event_id = :eventId)", nativeQuery = true)
    List<User> getUsersByEventId(@Param("eventId") Long eventId);
}
