package pl.websm.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"projects"})
@Entity
public class Timeline {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer positionIndex;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="timeline_project", joinColumns={@JoinColumn(name="TIMELINE_ID")},
            inverseJoinColumns={@JoinColumn(name="PROJECT_ID")})
    private Set<Project> projects;

    public Timeline() {
        projects = new HashSet<>();
    }
}