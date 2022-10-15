package br.com.statsdatacollector.application.api.country.sync;

import br.com.statsdatacollector.domain.country.Country;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CountryMapperSync {

    public List<CountryResponse> toCountriesResponse(List<Country> countries) {
        return countries.stream().map(this::toCountryResponse)
                .collect(Collectors.toList());
    }

    private CountryResponse toCountryResponse(Country country) {
        return new CountryResponse()
                .Builder(country.getCode(), country.getName(), country.getFlag());
    }


}
