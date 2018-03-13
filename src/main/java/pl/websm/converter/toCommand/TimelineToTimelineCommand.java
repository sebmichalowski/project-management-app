package pl.websm.converter.toCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.TimelineCommand;
import pl.websm.model.Timeline;

@Component
public class TimelineToTimelineCommand implements Converter<Timeline, TimelineCommand> {
    @Override
    public TimelineCommand convert(Timeline timeline) {
        return null;
    }
}
