package com.teamplanner.web;

import com.teamplanner.web.events.MeetingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MeetingEventController {
    private static final Logger LOG
            = LoggerFactory.getLogger(MeetingEventController.class);

    @PostMapping("/receiveMeetingEvent")
    void receiveMeetingEvent(@RequestBody MeetingEvent meetingEvent) {

    }

}
