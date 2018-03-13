package pl.websm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.websm.model.Dashboard;

import java.util.Optional;

@Repository
public interface DashboardRepository extends CrudRepository <Dashboard, Long> {
    Optional<Dashboard> findById(Long id);
}
