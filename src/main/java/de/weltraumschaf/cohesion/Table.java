package de.weltraumschaf.cohesion;

import java.util.Objects;

/**
 *
 */
final class Table {
    private final String name;

    Table(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }
}
