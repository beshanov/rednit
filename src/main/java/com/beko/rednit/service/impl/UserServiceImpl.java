package com.beko.rednit.service.impl;

import com.beko.rednit.dao.UserRepository;
import com.beko.rednit.domain.User;
import com.beko.rednit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsersByEventId(Long eventId) {
        List<User> users = userRepository.getUsersByEventId(eventId);
        return users;
    }
}
