package br.com.statsdatacollector.infrastructure.league;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueJpaRepository extends JpaRepository<LeagueEntity, Long> {
}
