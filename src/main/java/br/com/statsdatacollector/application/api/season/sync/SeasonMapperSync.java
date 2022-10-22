package br.com.statsdatacollector.application.api.season.sync;

import br.com.statsdatacollector.domain.season.Season;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SeasonMapperSync {

    public List<SeasonResponse> toSeasonsResponse(List<Season> seasons) {
        return seasons.stream().map(this::toSeasonResponse)
                .collect(Collectors.toList());
    }

    private SeasonResponse toSeasonResponse(Season season) {
        return new SeasonResponse()
                .Builder(season.getYear());
    }


}
