package org.launchcode.codeevents.data;

import org.launchcode.codeevents.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {

    private static final Map<Integer, Event> events = new HashMap<>();

    public static void addEvent(Event event) {
        events.put(event.getId(), event);
    }

    public static Event getById(int id) {
        return events.get(id);
    }

    public static Collection<Event> getAll() {
        return events.values();
    }

    public static void removeEvent(int id) {
        events.remove(id);
    }
}
