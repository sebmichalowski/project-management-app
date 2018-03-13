package pl.websm.model;

import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(exclude = {"dashboardTimelines"})
@Entity
public class Dashboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="dashboard_timeline", joinColumns={@JoinColumn(name="DASHBOARD_ID")},
            inverseJoinColumns={@JoinColumn(name="TIMELINE_ID")})
    private Set<Timeline> dashboardTimelines;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="dashboard_featuredproject", joinColumns={@JoinColumn(name="DASHBOARD_ID")},
            inverseJoinColumns={@JoinColumn(name="FEATUREDPROJECT_ID")})
    private Set<FeaturedProject> featuredProjects;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public Dashboard() {
        dashboardTimelines = new HashSet<>();
        featuredProjects = new HashSet<>();
    }

    public Long getId() {
        return this.id;
    }

    public Set<Timeline> getDashboardTimelines() {
        return this.dashboardTimelines;
    }

    public Set<FeaturedProject> getFeaturedProjects() {
        return featuredProjects;
    }

    public User getUser() {
        return this.user;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDashboardTimelines(Set<Timeline> dashboardTimelines) {
        this.dashboardTimelines = dashboardTimelines;
    }

    public void setFeaturedProjects(Set<FeaturedProject> featuredProjects) {
        this.featuredProjects = featuredProjects;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String toString() {
        return "Dashboard(id=" + this.getId() + ", dashboardTimelines=" + this.getDashboardTimelines() + ", user=" + this.getUser().getId() + ")";
    }
}