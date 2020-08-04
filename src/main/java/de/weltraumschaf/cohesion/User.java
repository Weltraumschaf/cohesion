package de.weltraumschaf.cohesion;

import java.util.Objects;

/**
 *
 */
final class User {
    private final String name;
    private final String password;

    User(final String name, final String password) {
        this.name = Objects.requireNonNull(name);
        this.password = Objects.requireNonNull(password);
    }
}
