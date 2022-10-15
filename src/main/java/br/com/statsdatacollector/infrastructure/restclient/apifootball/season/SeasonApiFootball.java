package br.com.statsdatacollector.infrastructure.restclient.apifootball.season;

import br.com.statsdatacollector.domain.season.Season;
import br.com.statsdatacollector.domain.season.SeasonRestClientPort;
import br.com.statsdatacollector.infrastructure.restclient.apifootball.ApiFootballClient;
import br.com.statsdatacollector.infrastructure.season.SeasonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SeasonApiFootball implements SeasonRestClientPort {

    private ApiFootballClient apiFootballClient;

    private SeasonMapper seasonMapper;
    @Autowired
    public SeasonApiFootball(
            ApiFootballClient apiFootballClient,
            SeasonMapper seasonMapper
    ) {
        this.apiFootballClient = apiFootballClient;
        this.seasonMapper = seasonMapper;
    }
    @Override
    public List<Season> seasons() {
        return this.apiFootballClient.seasons().getResponse().stream().map(
                year -> seasonMapper.toSeason(year)
        ).collect(Collectors.toList());
    }
}
