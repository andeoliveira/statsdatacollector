package br.com.statsdatacollector.architecture;

import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.library.Architectures;

@AnalyzeClasses(packages = "br.com.statsdatacollector", importOptions =  { ImportOption.DoNotIncludeTests.class, ImportOption.DoNotIncludeJars.class })
public class GeneralTestArchitecture {
    private static String APPLICATION = "Application";
    private static String DOMAIN = "Domain";
    private static String INFRASTRUCTURE = "Infrastructure";
    private static String CONFIGURATION = "Configuration";

    @ArchTest
    public static final ArchRule layeredArchitecture = Architectures.layeredArchitecture()
        .layer(APPLICATION).definedBy("..application..")
        .layer(DOMAIN).definedBy("..domain..")
        .layer(INFRASTRUCTURE).definedBy("..infrastructure..")
        .layer(CONFIGURATION).definedBy("..configuration..")
        .whereLayer(APPLICATION).mayOnlyBeAccessedByLayers(CONFIGURATION)
        .whereLayer(DOMAIN).mayOnlyBeAccessedByLayers(APPLICATION, INFRASTRUCTURE)
        .whereLayer(INFRASTRUCTURE).mayOnlyBeAccessedByLayers(APPLICATION, CONFIGURATION);

}
