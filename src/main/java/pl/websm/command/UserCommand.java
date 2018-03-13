package pl.websm.command;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;

@Setter
@Getter
@NoArgsConstructor
public class UserCommand {
    private  Long id;

    @Size(min = 3, max = 30)
    private String name;

    private DashboardCommand dashboardCommand;
}
