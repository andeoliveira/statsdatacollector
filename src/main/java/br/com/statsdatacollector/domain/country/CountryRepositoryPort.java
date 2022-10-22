package br.com.statsdatacollector.domain.country;

import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface CountryRepositoryPort {

    void syncData(@Validated List<Country> countries);
}
