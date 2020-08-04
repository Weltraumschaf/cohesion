package de.weltraumschaf.cohesion;

import java.util.Objects;

/**
 *
 */
final class Importer {
    private final Server server;

    Importer(final Server server) {
        this.server = Objects.requireNonNull(server);
    }

    OutInfo importData(final ImportConfig config) {
        // do something.
        return new OutInfo("", 0, true);
    }
}
