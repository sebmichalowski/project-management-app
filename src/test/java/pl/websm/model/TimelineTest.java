package pl.websm.model;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TimelineTest {

    Timeline timeline;

    @Before
    public void setUp() throws Exception {
        timeline = new Timeline();
    }

    @Test
    public void setId() throws Exception {
        Long idValue = 13L;

        assertNull(timeline.getId());

        timeline.setId(idValue);
        assertEquals(idValue, timeline.getId());
    }

    @Test
    public void setPositionIndex() throws Exception {
        Integer positionValue = 10;

        assertNull(timeline.getPositionIndex());

        timeline.setPositionIndex(positionValue);
        assertEquals(positionValue, timeline.getPositionIndex());
    }

    @Test
    public void setProjects() throws Exception {
        Integer emptyArrayListSize = 0;
        assertEquals(emptyArrayListSize, (Integer) timeline.getProjects().size());

        Set<Project> projects = new HashSet<>();

        Project project = new Project();
        project.setId(1L);

        Project projectWithIdTwo = new Project();
        projectWithIdTwo.setId(2L);

        projects.add(projectWithIdTwo);
        projects.add(new Project());
        projects.add(project);

        Integer projectEstimatedSize = 3;

        Project projectWithIdThree = new Project();
        projectWithIdThree.setId(3L);

        timeline.setProjects(projects);

        assertEquals(projectEstimatedSize,(Integer) timeline.getProjects().size());

        assertTrue("Given set should contain projectWithIdTwo object",
                timeline.getProjects().contains(projectWithIdTwo));

        assertFalse("Given set should NOT contain projectWithIdThree object",
                timeline.getProjects().contains(projectWithIdThree));
    }
}