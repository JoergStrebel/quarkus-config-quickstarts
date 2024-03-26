package org.acme.config;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

import java.util.List;
import java.util.Optional;

@ConfigMapping(prefix = "country")
public interface Country {

    List<CountryConfiguration> country();
    static Country from(List<CountryConfiguration> countries) { return () -> countries; }

}
