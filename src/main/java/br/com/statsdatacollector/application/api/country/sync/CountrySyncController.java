package br.com.statsdatacollector.application.api.country.sync;

import br.com.statsdatacollector.domain.country.Country;
import br.com.statsdatacollector.domain.country.CountryProcessor;
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
        List<Country> countries = this.countryProcessor.countriesClientApi();
        this.countryProcessor.persistData(countries);
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
