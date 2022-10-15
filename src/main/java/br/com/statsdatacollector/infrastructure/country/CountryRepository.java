package br.com.statsdatacollector.infrastructure.country;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.country.CountryRepositoryPort;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@Component
public class CountryRepository implements CountryRepositoryPort {

    private CountryJpaRepository countryJpaRepository;

    private CountryMapper countryMapper;

    @Autowired
    CountryRepository(
            CountryJpaRepository countryJpaRepository,
            CountryMapper countryMapper
    ) {
        this.countryJpaRepository = countryJpaRepository;
        this.countryMapper = countryMapper;
    }
    @Override
    @Transactional
    public void syncData(@NotNull List<Country> countries) {

        List<CountryEntity> countriesEntity = countries.stream()
                .map(country -> countryMapper.toCountryEntity(country))
                .collect(Collectors.toList());

        this.countryJpaRepository.saveAll(countriesEntity);
    }
}
