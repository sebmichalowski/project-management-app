package pl.websm.converter.fromCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.TimelineCommand;
import pl.websm.model.Timeline;

@Component
public class TimelineCommandToTimeline implements Converter<TimelineCommand, Timeline>{

    @Override
    public Timeline convert(TimelineCommand timelineCommand) {
        return null;
    }
}
