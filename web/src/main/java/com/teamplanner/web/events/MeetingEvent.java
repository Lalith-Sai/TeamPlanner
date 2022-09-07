package com.teamplanner.web.events;

import com.google.common.collect.ImmutableList;
import org.immutables.value.Value;

import java.time.Instant;

@Value.Immutable
public interface MeetingEvent {
   int getMeetingId();

   ImmutableList<Instant> getSlots();

   String getUsername();
}
