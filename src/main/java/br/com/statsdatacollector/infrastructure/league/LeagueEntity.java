package br.com.statsdatacollector.infrastructure.league;
import javax.persistence.*;

@Entity
@Table(name = "league")
public class LeagueEntity {

    @Id
    @GeneratedValue(generator = "league_seq_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "league_seq_gen", sequenceName = "league_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", length = 250, nullable = false)
    private String name;

    @Column(name = "type", length = 10, nullable = false)
    private String type;

    @Column(name = "logo", nullable = true)
    private String logo;

    public LeagueEntity Builder(String name, String type, String logo) {
        this.name = name;
        this.logo = logo;
        this.type = type;
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
