package br.com.statsdatacollector.infrastructure.restclient.apifootball.country;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.country.CountryRestClientPort;
import br.com.statsdatacollector.infrastructure.restclient.apifootball.ApiFootballClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CountryApiFootball implements CountryRestClientPort {

    private ApiFootballClient apiFootballClient;
    private CountryMapper coutryMapper;

    public CountryApiFootball(ApiFootballClient apiFootballClient) {
        this.apiFootballClient = apiFootballClient;
    }
    @Override
    public List<Country> countries() {
        return this.apiFootballClient.countries().getResponse();
    }
}
