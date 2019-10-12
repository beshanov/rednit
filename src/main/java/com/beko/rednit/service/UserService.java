package com.beko.rednit.service;

import com.beko.rednit.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> getUserById(Long userId);
    User save(User user);
    void delete(User user);
    Iterable<User> getAll();
    List<User> getUsersByEventId(Long eventId);
}
