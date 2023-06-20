package com.example.demo.service;

import com.example.demo.model.Event;
import com.example.demo.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private EventRepository eventRepository;

    public void addEventToDb(Event event){
        if(event != null && event.getCount() <= event.getMaxCount() && event.getPlace() != null)
            eventRepository.save(event);
    }

    public  List<Event> getEventList(){
        return eventRepository.findAll();
    }

    public  Event getEventBasedOnPlace(String place) {
        return  eventRepository.findByplace((place));
    }
}
