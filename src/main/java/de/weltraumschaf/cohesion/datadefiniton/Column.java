package de.weltraumschaf.cohesion.datadefiniton;

import java.util.Objects;

/**
 *
 */
public final class Column {
    private final String name;

    private Column(final String name) {
        this.name = Objects.requireNonNull(name);
    }

    public static final Column from(final String name) {
        return new Column(name);
    }
}
