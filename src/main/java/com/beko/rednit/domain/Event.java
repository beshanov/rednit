package com.beko.rednit.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "events")
@Data
@RequiredArgsConstructor
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
    private List<User> users = new ArrayList<>();

    @Override
    public String toString() {
        return "Event with id : " + getId();
    }
}
