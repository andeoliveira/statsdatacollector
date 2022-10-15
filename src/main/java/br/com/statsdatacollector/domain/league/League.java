package br.com.statsdatacollector.domain.league;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.season.Season;

public class League {

    private Long id;

    private String name;

    private String logo;

    private Country country;

    private Season season;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
