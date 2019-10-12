package com.beko.rednit.service;

import com.beko.rednit.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsersByEventId(Long eventId);
}
