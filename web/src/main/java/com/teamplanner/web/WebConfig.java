package com.teamplanner.web;

import com.teamplanner.web.controller.MeetingEventController;
import org.springframework.context.annotation.Import;

@Import(MeetingEventController.class)
public class WebConfig {
}
