package org.launchcode.codeevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventsController {

//    private static List<String> events = new ArrayList<>();

//    @GetMapping()
//    public String displayEventsList(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";
//    }

    @GetMapping()
    public String displayEventsHashMap(Model model) {
        HashMap<String, String> events = new HashMap<>();
        events.put("AIGA Northwest Arkansas", "AIGA NWA works to advance design as a professional craft, strategic advantage, and vital cultural force here in Northwest Arkansas.");
        events.put("fayetteville.js", "A monthly group for anyone interested in the JavaScript or software development for the web platform. All skill levels are welcome.");
        events.put("Bentonville Java Users Group", "A monthly group for anyone interested in the JavaScript or software development for the web platform. All skill levels are welcome.");
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

//    @PostMapping("create")
//    public String createEvent(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//    }
}
