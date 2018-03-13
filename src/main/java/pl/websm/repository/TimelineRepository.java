package pl.websm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.websm.model.Timeline;

import java.util.Optional;
import java.util.Set;

@Repository
public interface TimelineRepository extends CrudRepository<Timeline, Long> {
    Optional<Timeline> findById(Long id);
}
