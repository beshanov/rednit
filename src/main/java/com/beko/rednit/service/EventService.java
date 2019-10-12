package com.beko.rednit.service;

import com.beko.rednit.domain.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    Optional<Event> getEventById(Long eventId);
    Event save(Event event);
    void delete(Event event);
    Iterable<Event> getAll();
    List<Event> getEventsByUserId(Long userId);
}
