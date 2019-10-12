package com.beko.rednit.service;

import com.beko.rednit.domain.Event;

import java.util.List;
import java.util.Optional;

public interface EventService {
    Optional<Event> getEventById(Long eventId);
    List<Event> getEventsByUserId(Long userId);
}
