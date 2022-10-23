package br.com.statsdatacollector.infrastructure.restclient.apifootball.country;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.country.CountryRestClientPort;
import br.com.statsdatacollector.infrastructure.restclient.apifootball.ApiFootballClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CountryApiFootball implements CountryRestClientPort {

    Logger logger = LoggerFactory.getLogger(CountryApiFootball.class);
    private ApiFootballClient apiFootballClient;
    private CountryMapper coutryMapper;

    public CountryApiFootball(ApiFootballClient apiFootballClient) {
        this.apiFootballClient = apiFootballClient;
    }
    @Override
    public List<Country> countries() {
        logger.info("Get countries list from API Client");
        List<Country> countries = this.apiFootballClient.countries().getResponse();
        logger.info("Return countries list from API Client - Size countries list: "+countries.size());
        return this.apiFootballClient.countries().getResponse();
    }
}
