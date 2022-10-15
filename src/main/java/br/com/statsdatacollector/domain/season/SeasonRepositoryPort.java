package br.com.statsdatacollector.domain.season;

import br.com.statsdatacollector.domain.country.Country;
import org.springframework.validation.annotation.Validated;

import java.util.List;

public interface SeasonRepositoryPort {

    void syncData(@Validated List<Season> seasons);
}
