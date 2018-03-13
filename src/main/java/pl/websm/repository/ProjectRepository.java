package pl.websm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.websm.model.Project;

import java.util.Optional;

@Repository
public interface ProjectRepository extends CrudRepository <Project, Long> {
    Optional<Project> findById(Long id);
}
