package com.example.demo.model;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @Column(name = "id")
    @GeneratedValue
    private int id;

    @Column(name = "place")
    private String place;

    @Column(name = "count")
    private int count;

    @Column(name = "maxCount")
    private int maxCount;

    @ManyToMany(mappedBy = "eventSet")
    private Set<Users> userSet = new HashSet<>();

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", place='" + place + '\'' +
                ", count=" + count +
                ", maxCount=" + maxCount +
                '}';
    }
}
