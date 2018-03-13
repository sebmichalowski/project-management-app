package pl.websm.converter.toCommand;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.websm.command.DashboardCommand;
import pl.websm.model.Dashboard;

@Component
public class DashboardToDashboardCommand implements Converter<Dashboard, DashboardCommand>{
    @Override
    public DashboardCommand convert(Dashboard dashboard) {
        return null;
    }
}
