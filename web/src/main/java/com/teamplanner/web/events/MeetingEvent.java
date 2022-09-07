package com.teamplanner.web.events;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableList;
import org.immutables.value.Value;

import java.time.Instant;

@Value.Immutable
@JsonDeserialize
public interface MeetingEvent {
   @JsonProperty("id")
   int getMeetingId();

   @JsonProperty("slots")
   ImmutableList<Instant> getSlots();

   @JsonProperty("name")
   String getUsername();
}
