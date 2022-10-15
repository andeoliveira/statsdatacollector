package br.com.statsdatacollector.infrastructure.restclient.apifootball;

import br.com.statsdatacollector.configuration.ObjectMapperConfig;
import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.country.CountryData;
import br.com.statsdatacollector.domain.season.SeasonData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(
        value = "${rest.client.api-football.value}",
        url = "${rest.client.api-football.baseUrl}",
        configuration = ObjectMapperConfig.class)
public interface ApiFootballClient {

    @RequestMapping(method = RequestMethod.GET, value = "/countries")
    CountryData countries();

    @RequestMapping(method = RequestMethod.GET, value = "leagues/seasons")
    SeasonData seasons();

}
