package br.com.statsdatacollector.infrastructure.restclient.apifootball.league;

import br.com.statsdatacollector.domain.league.League;
import br.com.statsdatacollector.domain.season.Season;
import br.com.statsdatacollector.infrastructure.league.LeagueEntity;
import br.com.statsdatacollector.infrastructure.season.SeasonEntity;
import org.springframework.stereotype.Component;

@Component
public class LeagueMapper {
    public LeagueEntity toLeagueEntity(League league) {
        return new LeagueEntity().Builder(
                league.getName(), league.getType(), league.getLogo()
        );
    }
    public League toLeague(Long id, String name, String type, String logo) {
        return new League().Builder(id, name, type, logo);
    }
}
