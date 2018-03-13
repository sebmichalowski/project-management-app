package pl.websm.service;

import pl.websm.model.Project;

public interface ProjectService {
    Project createNewProject(String name);
    Project findById(Long id);
}
