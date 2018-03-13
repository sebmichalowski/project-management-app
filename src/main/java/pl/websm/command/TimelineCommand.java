package pl.websm.command;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class TimelineCommand {
    private Long id;
    private Integer positionIndex;
    private List<ProjectCommand> projectCommandList;
    private DashboardCommand dashboardCommand;

    public TimelineCommand() {
        this.projectCommandList = new ArrayList<>();
    }
}
