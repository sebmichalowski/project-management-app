package pl.websm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.websm.exceptions.NotFoundException;
import pl.websm.model.Project;
import pl.websm.repository.ProjectRepository;

import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project createNewProject(String name) {
        return null;
    }

    @Override
    public Project findById(Long id) {
        Optional<Project> projectOptional = projectRepository.findById(id);

        if (!projectOptional.isPresent()) {
            throw new NotFoundException("User Not Found. For ID value: " + id.toString() );
        }

        return projectOptional.get();
    }
}
