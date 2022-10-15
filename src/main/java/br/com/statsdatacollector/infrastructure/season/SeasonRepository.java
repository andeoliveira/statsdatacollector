package br.com.statsdatacollector.infrastructure.season;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.country.CountryRepositoryPort;
import br.com.statsdatacollector.domain.season.Season;
import br.com.statsdatacollector.domain.season.SeasonRepositoryPort;
import br.com.statsdatacollector.infrastructure.country.CountryEntity;
import br.com.statsdatacollector.infrastructure.country.CountryJpaRepository;
import br.com.statsdatacollector.infrastructure.country.CountryMapper;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@Component
public class SeasonRepository implements SeasonRepositoryPort {

    private SeasonJpaRepository seasonJpaRepository;

    private SeasonMapper seasonMapper;

    @Autowired
    SeasonRepository(
            SeasonJpaRepository seasonJpaRepository,
            SeasonMapper seasonMapper
    ) {
        this.seasonJpaRepository = seasonJpaRepository;
        this.seasonMapper = seasonMapper;
    }
    @Override
    @Transactional
    public void syncData(@NotNull List<Season> seasons) {

        List<SeasonEntity> seasonsEntity = seasons.stream()
                .map(season -> seasonMapper.toSeasonEntity(season))
                .collect(Collectors.toList());

        this.seasonJpaRepository.saveAll(seasonsEntity);
    }
}
