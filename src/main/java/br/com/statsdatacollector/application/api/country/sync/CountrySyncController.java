package br.com.statsdatacollector.application.api.country.sync;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.country.CountryProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("countries-sync")
public class CountrySyncController {

    Logger logger = LoggerFactory.getLogger(CountrySyncController.class);
    private CountryMapperSync countryMapper;
    private CountryProcessor countryProcessor;

    @Autowired
    CountrySyncController(
            CountryMapperSync countryMapper, CountryProcessor countryProcessor
    ) {
        this.countryMapper = countryMapper;
        this.countryProcessor = countryProcessor;
    }

    @PostMapping("/run")
    public void runSyncCountries(){
        logger.info("Process initialization for All Countries of API Client");
        List<Country> countries = this.countryProcessor.countriesClientApi();
        logger.info("Initialization of persistence of Countries result of API Client");
        this.countryProcessor.persistData(countries);
        logger.info("Finish process and persistence of Countries API Client");
    }

    @GetMapping("/list")
    public ResponseEntity<List<CountryResponse>> countries() {
        return ResponseEntity.ok(
                this.countryMapper.toCountriesResponse(
                        this.countryProcessor.countriesClientApi()
                )
        );
    }



}
