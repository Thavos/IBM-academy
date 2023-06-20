package com.example.demo.controller;

import com.example.demo.model.Event;
import com.example.demo.service.Service;
import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/ibm")
public class EventController {

    @Autowired
    private Service service;

    @GetMapping("/")
    public String getInitialPage(Model model) {
        model.addAttribute("eventList", service.getEventList());
        model.addAttribute("partyEvent", new Event());
        return "Events";
    }

    @PostMapping("/")
    public String addEvent(Model model, @ModelAttribute Event event) {
        service.addEventToList(event);
        return "redirect:/ibm/";
    }

}
