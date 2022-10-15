package br.com.statsdatacollector.infrastructure.season;

import javax.persistence.*;

@Entity
@Table(name = "season")
public class SeasonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "season_seq_gen")
    @SequenceGenerator(name = "season_seq_gen", sequenceName = "season_seq", allocationSize = 1)
    private Long id;

    @Column(name = "year", nullable = false, unique = true, length = 4)
    private Integer year;

    public SeasonEntity Builder(String year) {
        this.setYear(Integer.valueOf(year));
        return this;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
}
