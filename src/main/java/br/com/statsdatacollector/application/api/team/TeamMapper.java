package br.com.statsdatacollector.application.api.team;

import org.springframework.stereotype.Component;

@Component
public class TeamMapper {

    public TeamResponse toTeamResponse(String id) {
        return new TeamResponse().builder(id);
    }

}
