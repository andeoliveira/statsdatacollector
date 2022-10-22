package br.com.statsdatacollector.domain.league;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.season.Season;

public class League {

    private Long id;

    private String name;

    private String type;

    private String logo;

    public League Builder(Long id, String name, String type, String logo) {
        this.setId(id);
        this.setName(name);
        this.setLogo(logo);
        this.setType(type);
        return this;
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

}
