package br.com.statsdatacollector.infrastructure.restclient.apifootball.league;

import br.com.statsdatacollector.domain.league.League;
import br.com.statsdatacollector.domain.league.LeagueRestClientPort;
import br.com.statsdatacollector.infrastructure.restclient.apifootball.ApiFootballClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LeagueApiFootball implements LeagueRestClientPort {

    private ApiFootballClient apiFootballClient;

    private LeagueMapper leagueMapper;

    @Autowired
    public LeagueApiFootball(
            ApiFootballClient apiFootballClient,
            LeagueMapper leagueMapper
    ) {
        this.apiFootballClient = apiFootballClient;
        this.leagueMapper = leagueMapper;
    }
    @Override
    public List<League> leagues() {
        return this.apiFootballClient.leagues().getResponse().stream().map(
                league -> leagueMapper.toLeague(1L, "teste", "liga", "")
        ).collect(Collectors.toList());
    }
}
