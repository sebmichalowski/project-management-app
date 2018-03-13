package pl.websm.converter.fromCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.ProjectCommand;
import pl.websm.model.Project;

@Component
public class ProjectCommandToProject implements Converter<ProjectCommand, Project> {
    @Override
    public Project convert(ProjectCommand projectCommand) {
        return null;
    }
}
