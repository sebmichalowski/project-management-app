package pl.websm.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.websm.command.TimelineCommand;
import pl.websm.converter.fromCommand.TimelineCommandToTimeline;
import pl.websm.converter.toCommand.TimelineToTimelineCommand;
import pl.websm.exceptions.NotFoundException;
import pl.websm.model.Timeline;
import pl.websm.repository.TimelineRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class TimelineServiceImpl implements TimelineService {

    private final TimelineRepository timelineRepository;
    private final TimelineToTimelineCommand timelineToTimelineCommand;
    private final TimelineCommandToTimeline timelineCommandToTimeline;

    public TimelineServiceImpl(TimelineRepository timelineRepository,
                               TimelineToTimelineCommand timelineToTimelineCommand,
                               TimelineCommandToTimeline timelineCommandToTimeline) {
        this.timelineRepository = timelineRepository;
        this.timelineToTimelineCommand = timelineToTimelineCommand;
        this.timelineCommandToTimeline = timelineCommandToTimeline;
    }


    @Override
    public Set<Timeline> getTimelines() {

        log.debug("getting the ProjectTimelines set from db");

        Set<Timeline> timelines = new HashSet<>();
        timelineRepository.findAll().iterator().forEachRemaining(timelines::add);
        return timelines;
    }

    @Override
    public Timeline findById(Long id) {

        Optional<Timeline> projectTimelineOptional = timelineRepository.findById(id);

        if (!projectTimelineOptional.isPresent()) {
            throw new NotFoundException("Timeline Not Found. For ID value: " + id.toString() );
        }

        return projectTimelineOptional.get();
    }

    @Override
    public TimelineCommand findCommandById(Long id) {
        return null;
    }

    @Override
    public TimelineCommand saveProjectTimelineCommand() {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
