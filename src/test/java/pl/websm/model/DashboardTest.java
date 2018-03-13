package pl.websm.model;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class DashboardTest {
    Dashboard dashboard;
    Dashboard secondDashboard;

    @Before
    public void setUp() throws Exception {
        dashboard = new Dashboard();
        secondDashboard = new Dashboard();

    }

    @Test
    public void setId() throws Exception {
        assertNull("Id should be null", dashboard.getId());

        Long idValue = 2L;
        dashboard.setId(idValue);

        assertEquals(idValue, dashboard.getId());

        secondDashboard.setId(idValue + 1L);
    }

    @Test
    public void setDashboardTimelines() throws Exception {
        Set<Timeline> dashboardTimelines = new HashSet<>();

        assertTrue(dashboard.getDashboardTimelines().isEmpty());

        Timeline firstTimeline = new Timeline();
        firstTimeline.setId(61L);

        Timeline secondTimeline = new Timeline();
        firstTimeline.setId(62L);

        Timeline thirdTimeline = new Timeline();
        firstTimeline.setId(63L);

        dashboardTimelines.add(firstTimeline);
        dashboardTimelines.add(secondTimeline);
        dashboardTimelines.add(thirdTimeline);

        dashboard.setDashboardTimelines(dashboardTimelines);


        assertFalse(dashboard.getDashboardTimelines().isEmpty());

        int expectedProjectTimelineSetSize = dashboardTimelines.size();
        assertEquals(expectedProjectTimelineSetSize, dashboard.getDashboardTimelines().size());

        assertNotNull(secondDashboard.getDashboardTimelines());

        secondDashboard.setDashboardTimelines(dashboardTimelines);
        assertTrue(dashboard.getDashboardTimelines().equals(secondDashboard.getDashboardTimelines()));
    }

    @Test
    public void setUser() throws Exception {
        User user = new User();
        user.setId(3000L);

        User secondUser = new User();
        user.setId(3001L);

        assertNull(dashboard.getUser());

        dashboard.setUser(user);
        assertEquals(user, dashboard.getUser());
        assertTrue(dashboard.getUser().equals(user));
        assertFalse(dashboard.getUser().equals(secondUser));

    }

}