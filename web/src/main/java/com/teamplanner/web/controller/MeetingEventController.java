package com.teamplanner.web.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.google.common.collect.ImmutableList;
import com.teamplanner.web.events.ImmutableMeetingEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.Instant;

@RestController
public class MeetingEventController {
    private static final Logger LOG
            = LoggerFactory.getLogger(MeetingEventController.class);

    @PostMapping("/sendMeetingEvent")
    void receiveMeetingEvent(@RequestBody String payload) throws IOException {
        try {
            jsonToMeetingEvent(payload);
        }
        catch (Exception e) {
            throw new IOException(e);
        }
    }

    void jsonToMeetingEvent(String payload) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        JsonNode jsonNode = mapper.readTree(payload);

        // XXX TODO: Parse jsonString to MeetingEvent entity

//        ObjectReader reader = mapper.readerFor(new TypeReference<ImmutableList<Instant>>() {});
//
//        int id = jsonNode.get("id").asInt();
//        ImmutableList<Instant> slots = reader.readValue(jsonNode.get("slots"));
//        String username = jsonNode.get("username").asText();
//
//        ImmutableMeetingEvent event = ImmutableMeetingEvent.builder().build()
//                .withMeetingId(id)
//                .withSlots(slots)
//                .withUsername(username);

        System.out.println(jsonNode.toString());
    }
}
