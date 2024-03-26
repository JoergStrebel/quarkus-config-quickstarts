package org.acme.config;

import io.smallrye.config.WithName;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface CountryConfiguration {

    List<String> codes();
    //@WithName("product-types")
    List<String> types();

    static String dump(List<String> codes){
        StringBuilder result = new StringBuilder();
        codes.forEach(result::append);
        return result.toString();
    }
}
