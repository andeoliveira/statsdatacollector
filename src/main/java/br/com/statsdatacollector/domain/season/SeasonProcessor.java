package br.com.statsdatacollector.domain.season;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeasonProcessor {

    private SeasonRepositoryPort seasonRepositoryPort;

    private SeasonRestClientPort seasonRestClientPort;

    @Autowired
    public SeasonProcessor(
            SeasonRepositoryPort seasonRepositoryPort,
            SeasonRestClientPort seasonRestClientPort) {
        this.seasonRepositoryPort = seasonRepositoryPort;
        this.seasonRestClientPort = seasonRestClientPort;
    }

    public void persistData(List<Season> seasons) {
        this.seasonRepositoryPort.syncData(seasons);
    }

    public List<Season> fromApi() {
       return this.seasonRestClientPort.seasons();
    }

}
