package br.com.statsdatacollector.application.api.country.sync;

public class CountryResponse {

    private String id;

    private String name;

    private String logo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public CountryResponse Builder(String id, String name, String logo) {
        this.setId(id);
        this.setLogo(logo);
        this.setName(name);
        return this;
    }
}
