package de.weltraumschaf.cohesion;

import java.net.URI;
import java.util.Objects;

/**
 *
 */
final class Server {
    private final URI url;
    private final User user;

    Server(final URI url, final User user) {
        this.url = Objects.requireNonNull(url);
        this.user = Objects.requireNonNull(user);
    }
}
