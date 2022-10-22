package br.com.statsdatacollector.infrastructure.league;

import br.com.statsdatacollector.domain.league.League;
import br.com.statsdatacollector.domain.league.LeagueRepositoryPort;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@Component
public class LeagueRepository implements LeagueRepositoryPort {

    private LeagueJpaRepository leagueJpaRepository;

    @Autowired
    LeagueRepository(
            LeagueJpaRepository leagueJpaRepository
    ) {
        this.leagueJpaRepository = leagueJpaRepository;
    }
    @Override
    @Transactional
    public void syncData(@NotNull List<League> leagues) {
        //WIP
    }
}
