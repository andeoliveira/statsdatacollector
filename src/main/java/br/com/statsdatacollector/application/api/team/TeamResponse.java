package br.com.statsdatacollector.application.api.team;

public class TeamResponse {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TeamResponse builder(String id) {
        this.setId(Long.getLong(id));
        return this;
    }

}
