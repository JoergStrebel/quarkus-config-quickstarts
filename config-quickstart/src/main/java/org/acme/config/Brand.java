package org.acme.config;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.Arrays;
import java.util.Optional;

@RegisterForReflection
public enum Brand {
    BMW("bmwCar"),
    BMWi("bmwi"),
    MINI("mini");

    private final String ucpBrand;

    Brand(String ucpBrand) {
        this.ucpBrand = ucpBrand;
    }

    public String getUCPBrand() {
        return ucpBrand;
    }

    public static Optional<Brand> fromUCPBrand(String ucpBrand) {
        return Arrays.stream(Brand.values())
                .filter(brand -> brand.ucpBrand.equals(ucpBrand))
                .findFirst();
    }
}
