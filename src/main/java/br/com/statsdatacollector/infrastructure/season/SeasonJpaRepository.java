package br.com.statsdatacollector.infrastructure.season;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeasonJpaRepository extends JpaRepository<SeasonEntity, Long> {
}
