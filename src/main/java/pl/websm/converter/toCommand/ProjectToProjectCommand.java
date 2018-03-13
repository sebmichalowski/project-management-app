package pl.websm.converter.toCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.ProjectCommand;
import pl.websm.model.Project;

@Component
public class ProjectToProjectCommand implements Converter<Project, ProjectCommand> {
    @Override
    public ProjectCommand convert(Project project) {
        return null;
    }
}
