package de.weltraumschaf.cohesion.datadefiniton;

import java.util.Objects;

/**
 *
 */
public final class Table {
    private final String name;

    private Table(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return name;
    }

    public static Table from(final String name) {
        return new Table(name);
    }
}
