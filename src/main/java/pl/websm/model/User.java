package pl.websm.model;

import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;

@EqualsAndHashCode(exclude = "dashboard")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Email
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    private Dashboard dashboard;

    public User() {
    }


    public void setDashboard(Dashboard dashboard) {
        if (dashboard != null) {
            this.dashboard = dashboard;
            dashboard.setUser(this);
        }
    }

    public Long getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public Dashboard getDashboard() {
        return this.dashboard;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return "User(id=" + this.getId() + ", email=" + this.getEmail() + ", password=" + this.getPassword() + ", dashboard=" + this.getDashboard().getId() + ")";
    }
}