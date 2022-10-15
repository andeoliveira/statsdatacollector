package br.com.statsdatacollector.domain.country;

import br.com.statsdatacollector.infrastructure.country.CountryEntity;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface CountryRepositoryPort {

    void syncData(@Validated List<Country> countries);
}
