package pl.websm.service;

import pl.websm.command.TimelineCommand;
import pl.websm.model.Timeline;

import java.util.Set;

public interface TimelineService {

    Set<Timeline> getTimelines();

    Timeline findById(Long id);

    TimelineCommand findCommandById(Long id);

    TimelineCommand saveProjectTimelineCommand();

    void deleteById(Long id);
}
