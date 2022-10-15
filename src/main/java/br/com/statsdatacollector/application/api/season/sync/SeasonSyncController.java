package br.com.statsdatacollector.application.api.season.sync;

import br.com.statsdatacollector.domain.season.Season;
import br.com.statsdatacollector.domain.season.SeasonProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("seasons-sync")
public class SeasonSyncController {

    private SeasonProcessor seasonProcessor;

    private SeasonMapperSync seasonMapperSync;

    @Autowired
    public SeasonSyncController(
            SeasonProcessor seasonProcessor,
            SeasonMapperSync seasonMapperSync
    ) {
        this.seasonProcessor = seasonProcessor;
        this.seasonMapperSync = seasonMapperSync;
    }

    @PostMapping("/run")
    public ResponseEntity runSyncSeasons() {
        List<Season> seasons = this.seasonProcessor.fromApi();
        this.seasonProcessor.persistData(seasons);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/list")
    public ResponseEntity<List<SeasonResponse>> seasons() {
        return ResponseEntity.ok(
                this.seasonMapperSync.toSeasonsResponse(
                    this.seasonProcessor.fromApi()
                )
        );
    }
}
