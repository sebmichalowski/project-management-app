package pl.websm.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.websm.exceptions.NotFoundException;
import pl.websm.model.Dashboard;
import pl.websm.model.Timeline;
import pl.websm.model.User;
import pl.websm.repository.UserRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User createNewUser(String name, String password) {
        // create user with initial data
        Timeline timeline = new Timeline();
        timeline.setPositionIndex(1);
        Set<Timeline> timelines = new HashSet<>();
        timelines.add(timeline);

        Dashboard dashboard = new Dashboard();
        dashboard.setDashboardTimelines(timelines);

        User user = new User();
        user.setEmail(name);
        user.setPassword(password);
        user.setDashboard(dashboard);

        return userRepository.save(user);
    }

    @Override
    public User findById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (!userOptional.isPresent()) {
            throw new NotFoundException("User Not Found. For ID value: " + id.toString() );
        }

        return userOptional.get();
    }
}
