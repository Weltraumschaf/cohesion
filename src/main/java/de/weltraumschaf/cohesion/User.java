package de.weltraumschaf.cohesion;

import java.util.Objects;

/**
 *
 */
final class User {
    private final String name;
    private final byte[] password;

    User(final String name, final byte[] password) {
        this.name = Objects.requireNonNull(name);
        this.password = Objects.requireNonNull(password);
    }
}
