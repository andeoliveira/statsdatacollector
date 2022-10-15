package br.com.statsdatacollector.infrastructure.season;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.season.Season;
import br.com.statsdatacollector.infrastructure.country.CountryEntity;
import org.springframework.stereotype.Component;

@Component
public class SeasonMapper {

    public SeasonEntity toSeasonEntity(Season season) {
        return new SeasonEntity().Builder(season.getYear().toString());
    }

    public Season toSeason(String year) {
        return new Season().Builder(year);
    }
}
