package pl.websm.converter.fromCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.DashboardCommand;
import pl.websm.model.Dashboard;

@Component
public class DashboardCommandToDashboard implements Converter<DashboardCommand, Dashboard> {

    @Override
    public Dashboard convert(DashboardCommand dashboardCommand) {
        return null;
    }
}
