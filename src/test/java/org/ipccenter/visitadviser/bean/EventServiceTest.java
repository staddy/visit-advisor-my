package org.ipccenter.visitadviser.bean;

import java.util.List;
import org.ipccenter.visitadvisor.bean.EventService;
import org.ipccenter.visitadvisor.model.Event;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author spitty
 */
@Test
public class EventServiceTest {
    
    public static void test() {
        EventService service = new EventService();
        int size = 10;
        List<Event> events = service.createEvents(size);
        System.out.println(events);
        Assert.assertEquals(events.size(), size, "Size of event list differs");
    }
}
