package pl.websm.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void setId() throws Exception {
        Long idValue = 13L;

        assertNull(user.getId());

        user.setId(idValue);
        assertEquals(user.getId(), idValue);
    }

    @Test
    public void setName() throws Exception {
        String nameString = "John Doe";

        assertNull(user.getEmail());

        user.setEmail(nameString);
        assertEquals(nameString, user.getEmail());
    }

    @Test
    public void setDashboard() throws Exception {
        Dashboard dashboard = new Dashboard();
        dashboard.setId(1L);

        assertNull(user.getDashboard());

        user.setDashboard(dashboard);
        assertEquals(dashboard, user.getDashboard());
    }
}