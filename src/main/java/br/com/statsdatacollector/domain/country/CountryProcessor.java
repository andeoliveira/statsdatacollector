package br.com.statsdatacollector.domain.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CountryProcessor {

    private CountryRepositoryPort countryRepositoryPort;

    private CountryRestClientPort countryRestClientPort;

    @Autowired
    CountryProcessor(
            CountryRepositoryPort countryRepositoryPort,
            CountryRestClientPort countryRestClientPort
    ) {
        this.countryRepositoryPort = countryRepositoryPort;
        this.countryRestClientPort = countryRestClientPort;
    }

    public void persistData(List<Country> countries) {
        this.countryRepositoryPort.syncData(countries);
    }

    public List<Country> countriesClientApi() {
        return this.countryRestClientPort.countries();
    }
}
