package org.ipccenter.visitadvisor.bean;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.ipccenter.visitadvisor.model.Event;

/**
 *
 * @author spitty
 */
@ManagedBean
@ApplicationScoped
public class EventService {

    /**
     * Generate sample list of events
     * @param size specifies size of result {@link List}
     * @return {@link List} of {@link Event}
     */
    public List<Event> createEvents(int size) {
        if (size < 1) {
            return Collections.EMPTY_LIST;
        }
        
        List<Event> events = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Event event = new Event(String.format("Event %3d", i), LocalDateTime.now().plusDays(i));
            event.setId(Long.valueOf(i));
            events.add(event);
        }
        return events;
    }

}
