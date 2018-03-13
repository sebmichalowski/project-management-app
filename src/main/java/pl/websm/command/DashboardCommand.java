package pl.websm.command;

import lombok.Getter;
import lombok.Setter;
import pl.websm.model.Timeline;
import pl.websm.model.User;

import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
public class DashboardCommand {
    private Long id;
    private Set<Timeline> dashboardTimelines;
    private User user;

    public DashboardCommand() {
        dashboardTimelines = new HashSet<>();
    }
}
