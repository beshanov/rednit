package com.beko.rednit.service.impl;

import com.beko.rednit.dao.EventRepository;
import com.beko.rednit.domain.Event;
import com.beko.rednit.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EventServiceImpl implements EventService {
    @Autowired
    EventRepository eventRepository;

    @Override
    public Optional<Event> getEventById(Long eventId) {
        return eventRepository.findById(eventId);
    }

    @Override
    public Event save(Event event) {
       return eventRepository.save(event);
    }

    @Override
    public void delete(Event event) {
        eventRepository.delete(event);
    }

    @Override
    public Iterable<Event> getAll() {
        return eventRepository.findAll();
    }

    @Override
    public List<Event> getEventsByUserId(Long userId) {
        return eventRepository.getEventsByUserId(userId);
    }
}
