package com.beko.rednit.domain;

import javax.persistence.*;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private Long authorId;
    private String place;
    private String description;
    @Enumerated(EnumType.STRING)
    private EventType eventType;
    @Temporal(TemporalType.DATE)
    private Calendar date;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "events")
    private Set<User> users = new HashSet<>();
}
