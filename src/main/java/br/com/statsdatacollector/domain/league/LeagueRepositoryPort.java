package br.com.statsdatacollector.domain.league;

import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface LeagueRepositoryPort {

    void syncData(@Validated List<League> leagues);
}
