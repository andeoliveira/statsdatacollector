package br.com.statsdatacollector.infrastructure.country;

import br.com.statsdatacollector.domain.country.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper {

    public CountryEntity toCountryEntity(Country country) {
        return new CountryEntity().Builder(
                country.getCode(), country.getFlag(), country.getName()
        );
    }
}
