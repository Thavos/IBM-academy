package com.example.demo.service;

import com.example.demo.model.Event;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    private List<Event> eventList = new ArrayList<>();

    public Service(){
        Event event = new Event();

        event.setPlace("Hlavak");
        event.setCount(20);
        event.setMaxCount(30);

        eventList.add(event);
    };

    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public void addEventToList(Event event) {
        if(event != null && event.getCount() <= event.getMaxCount() && event.getPlace() != null)
            eventList.add(event);
    }
}
