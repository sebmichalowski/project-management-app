package pl.websm.model;

import org.junit.Before;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import static org.junit.Assert.*;

public class ProjectTest {

    Project project;

    @Before
    public void setUp() throws Exception{
        project = new Project();
    }

    @Test
    public void setId() throws Exception {
        assertNull("Id should be null", project.getId());

        Long idValue = 2L;
        project.setId(idValue);

        assertEquals(idValue, project.getId());
    }

    @Test
    public void setName() throws Exception {
        String nameString = "Project Name";

        assertNull(project.getName());

        project.setName(nameString);
        assertEquals(nameString, project.getName());
    }

    @Test
    public void setStartDate() throws Exception {
        Long systemTimeValue = System.currentTimeMillis();
        LocalDate startDate = Instant.ofEpochMilli(systemTimeValue).atZone(ZoneId.systemDefault()).toLocalDate();

        project.setStartDate(startDate);
        assertEquals(startDate, project.getStartDate());
    }

    @Test
    public void setDueDate() throws Exception {
        Long systemTimeValue = System.currentTimeMillis();
        LocalDate date = Instant.ofEpochMilli(systemTimeValue).atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate datePlusSixDays = date.plusDays(6);

        String dueDateString = datePlusSixDays.toString();
        LocalDate dueDateConverted = LocalDate.parse(dueDateString);

        project.setDueDate(dueDateConverted);
        assertFalse("Should NOT be equal to datePlusSixDays variable", project.getDueDate().isEqual(date));
        assertTrue("Should be equal to datePlusSixDays variable", project.getDueDate().isEqual(datePlusSixDays));
    }

    @Test
    public void setDescription() throws Exception {
        String someString = "";
        String longDescription = "Lorem ipsum dolor sit amet dolor. Duis non odio. Aenean ac turpis vulputate sed, nunc. Praesent tortor quis quam sed nulla. Mauris urna. Nunc viverra luctus, enim nunc, fringilla et, placerat fringilla, vulputate tempor magna. Quisque lorem pretium justo. Curabitur at ipsum ac nulla pulvinar odio. Nullam volutpat, velit nec ultrices posuere cubilia Curae, Nulla ligula ut arcu. Nulla facilisi. Nulla facilisi. Nullam feugiat mattis egestas, nunc fringilla mauris. Fusce gravida, nisl sit amet, lacinia erat. In laoreet nisl a luctus et turpis. Sed adipiscing. Nam eget accumsan eu, nunc. Donec magna purus, nec massa. Maecenas eget justo. Aenean tortor venenatis pede. Sed et enim. Sed in sollicitudin quis, libero. Nulla hendrerit et, erat. Quisque condimentum. Donec libero purus fringilla neque tristique magna. Integer nonummy a, laoreet ante ipsum sit amet purus at lorem pretium wisi. Sed tristique sem. Integer convallis quam enim, malesuada et, ultricies vehicula, tortor ante in augue. Nulla euismod, quam nunc, tempus rutrum laoreet. Sed tristique interdum. Etiam ac turpis et netus et magnis dis parturient montes, nascetur ridiculus mus. Etiam sit amet, consectetuer congue dolor. Nulla facilisi. Vestibulum vel mauris ac ornare egestas aliquam, risus. Suspendisse luctus ut, tempus dictum enim. Suspendisse est. Lorem ipsum dolor in erat ornare id, ante. Proin vitae wisi nibh quis turpis eget metus. Curabitur egestas. Praesent commodo tempus, fringilla erat. Fusce vel ligula nunc, luctus at, egestas a, dui. Maecenas interdum sem vestibulum ac, varius et, lobortis velit eleifend magna porttitor vel, ipsum. Proin imperdiet neque. Sed adipiscing vitae, mollis lobortis. Maecenas quam eros ut aliquet ac, eleifend nunc libero, ultricies nulla, vitae ante. Curabitur et lacus sed massa nec sem orci, in faucibus a, vestibulum quis, dui. Etiam ut diam. Nam scelerisque a, pellentesque quis, justo. In hac habitasse platea dictumst. Proin nonummy enim eget sem ullamcorper fringilla, massa. Nulla facilisis urna et netus et ultrices posuere cubilia Curae, Duis porttitor risus. Sed in mattis varius. Cum sociis natoque penatibus et netus et ultrices dui. Nulla interdum sem quam, lobortis venenatis, nunc ac ornare laoreet. Nam scelerisque ligula, sed arcu. Vivamus justo. Fusce commodo nec, nisl. Vestibulum enim.";
        String longDescriptionIgnoreCase = "lorem Ipsum dolor sit amet dolor. Duis non odio. Aenean ac turpis vulputate sed, nunc. Praesent tortor quis quam sed nulla. Mauris urna. Nunc viverra luctus, enim nunc, fringilla et, placerat fringilla, vulputate tempor magna. Quisque lorem pretium justo. Curabitur at ipsum ac nulla pulvinar odio. Nullam volutpat, velit nec ultrices posuere cubilia Curae, Nulla ligula ut arcu. Nulla facilisi. Nulla facilisi. Nullam feugiat mattis egestas, nunc fringilla mauris. Fusce gravida, nisl sit amet, lacinia erat. In laoreet nisl a luctus et turpis. Sed adipiscing. Nam eget accumsan eu, nunc. Donec magna purus, nec massa. Maecenas eget justo. Aenean tortor venenatis pede. Sed et enim. Sed in sollicitudin quis, libero. Nulla hendrerit et, erat. Quisque condimentum. Donec libero purus fringilla neque tristique magna. Integer nonummy a, laoreet ante ipsum sit amet purus at lorem pretium wisi. Sed tristique sem. Integer convallis quam enim, malesuada et, ultricies vehicula, tortor ante in augue. Nulla euismod, quam nunc, tempus rutrum laoreet. Sed tristique interdum. Etiam ac turpis et netus et magnis dis parturient montes, nascetur ridiculus mus. Etiam sit amet, consectetuer congue dolor. Nulla facilisi. Vestibulum vel mauris ac ornare egestas aliquam, risus. Suspendisse luctus ut, tempus dictum enim. Suspendisse est. Lorem ipsum dolor in erat ornare id, ante. Proin vitae wisi nibh quis turpis eget metus. Curabitur egestas. Praesent commodo tempus, fringilla erat. Fusce vel ligula nunc, luctus at, egestas a, dui. Maecenas interdum sem vestibulum ac, varius et, lobortis velit eleifend magna porttitor vel, ipsum. Proin imperdiet neque. Sed adipiscing vitae, mollis lobortis. Maecenas quam eros ut aliquet ac, eleifend nunc libero, ultricies nulla, vitae ante. Curabitur et lacus sed massa nec sem orci, in faucibus a, vestibulum quis, dui. Etiam ut diam. Nam scelerisque a, pellentesque quis, justo. In hac habitasse platea dictumst. Proin nonummy enim eget sem ullamcorper fringilla, massa. Nulla facilisis urna et netus et ultrices posuere cubilia Curae, Duis porttitor risus. Sed in mattis varius. Cum sociis natoque penatibus et netus et ultrices dui. Nulla interdum sem quam, lobortis venenatis, nunc ac ornare laoreet. Nam scelerisque ligula, sed arcu. Vivamus justo. Fusce commodo nec, nisl. Vestibulum enim.";

        project.setDescription(someString);
        assertTrue(project.getDescription().isEmpty());

        project.setDescription(longDescription);
        assertFalse(project.getDescription().equalsIgnoreCase(someString));
        assertFalse(project.getDescription().equals(longDescriptionIgnoreCase));
        assertTrue(project.getDescription().equals(longDescription));
        assertTrue(project.getDescription().equalsIgnoreCase(longDescriptionIgnoreCase));
    }
}