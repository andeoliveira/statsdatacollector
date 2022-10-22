package br.com.statsdatacollector.domain.league;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LeagueProcessor {

    private LeagueRepositoryPort leagueRepositoryPort;

    private LeagueRestClientPort leagueRestClientPort;

    @Autowired
    public LeagueProcessor(
            LeagueRepositoryPort leagueRepositoryPort,
            LeagueRestClientPort leagueRestClientPort) {
        this.leagueRepositoryPort = leagueRepositoryPort;
        this.leagueRestClientPort = leagueRestClientPort;
    }

    public void persistData(List<League> leagues) {
        this.leagueRepositoryPort.syncData(leagues);
    }

    public List<League> fromApi() {
       return this.leagueRestClientPort.leagues();
    }

}
