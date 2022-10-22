package br.com.statsdatacollector.infrastructure.restclient.apifootball;

import br.com.statsdatacollector.configuration.ObjectMapperConfig;
import br.com.statsdatacollector.domain.country.CountryData;
import br.com.statsdatacollector.domain.league.LeagueData;
import br.com.statsdatacollector.domain.season.SeasonData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(
        value = "${rest.client.api-football.value}",
        url = "${rest.client.api-football.baseUrl}",
        configuration = ObjectMapperConfig.class)
public interface ApiFootballClient {

    @RequestMapping(method = RequestMethod.GET, value = "/countries")
    CountryData countries();

    @RequestMapping(method = RequestMethod.GET, value = "leagues/seasons")
    SeasonData seasons();

    @RequestMapping(method = RequestMethod.GET, value = "/leagues")
    LeagueData leagues();

}