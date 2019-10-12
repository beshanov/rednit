package com.beko.rednit.dao;

import com.beko.rednit.domain.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
    @Query(value = "select * from events e where e.id = (select u_e.event_id from user_event u_e where u_e.user_id = :userId)", nativeQuery = true)
    List<Event> getEventsByUserId(@Param("userId") Long userId);
}
