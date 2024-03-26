package org.acme.config;

import io.smallrye.config.WithName;

import java.util.List;
import java.util.Optional;

public interface UcpConnection {

    @WithName("client")
    Optional<String> client();

    @WithName("source")
    Optional<String> source();
    @WithName("api-key-name")
    Optional<String> apiKeyName();

    static UcpConnection from(
            String client,
            String source,
            String apiKeyName
    ) {
        return new UcpConnection() {
            @Override
            public Optional<String> client() {
                return Optional.of(client);
            }

            @Override
            public Optional<String> source() {
                return Optional.of(source);
            }

            @Override
            public Optional<String> apiKeyName() {
                return Optional.of(apiKeyName);
            }
        };
    }
}
