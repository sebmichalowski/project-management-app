package pl.websm.devBoostrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.websm.model.Dashboard;
import pl.websm.model.Project;
import pl.websm.model.Timeline;
import pl.websm.model.User;
import pl.websm.repository.DashboardRepository;
import pl.websm.repository.ProjectRepository;
import pl.websm.repository.TimelineRepository;
import pl.websm.repository.UserRepository;
import pl.websm.service.ProjectService;
import pl.websm.service.TimelineService;
import pl.websm.service.UserService;

import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent>{
    private final UserRepository userRepository;
    private final DashboardRepository dashboardRepository;
    private final TimelineRepository timelineRepository;
    private final ProjectRepository projectRepository;
    private final UserService userService;
    private final ProjectService projectService;
    private final TimelineService timelineService;

    public DevBootstrap(UserRepository userRepository, DashboardRepository dashboardRepository, TimelineRepository timelineRepository, ProjectRepository projectRepository, UserService userService, ProjectService projectService, TimelineService timelineService) {
        this.userRepository = userRepository;
        this.dashboardRepository = dashboardRepository;
        this.timelineRepository = timelineRepository;
        this.projectRepository = projectRepository;
        this.userService = userService;
        this.projectService = projectService;
        this.timelineService = timelineService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        userService.createNewUser("email@email.com", "RandomPassword");
        User user = userService.findById(1L);
        Dashboard dashboard = user.getDashboard();
        Timeline timeline = new Timeline();
        timeline.setPositionIndex(3);
        Project project = new Project();
        project.setDescription("abc abc");
        timeline.getProjects().add(project);
        Set<Timeline> timelines = dashboard.getDashboardTimelines();
        timelines.add(timeline);
        userRepository.save(user);

        System.out.println(user.toString());

        Project project1 = projectService.findById(1L);
        project1.setDescription("abc 2");
        projectRepository.save(project1);

        Timeline timeline1 = timelineService.findById(1L);
        Set<Project> projects = timeline1.getProjects();
        Project project2 = new Project();
        project2.setDescription("second project");
        projects.add(project2);
        timelineRepository.save(timeline1);
    }
}
