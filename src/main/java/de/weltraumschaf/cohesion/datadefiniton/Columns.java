package de.weltraumschaf.cohesion.datadefiniton;

import java.util.*;

/**
 *
 */
public final class Columns {
    private final Collection<Column> columns;

    private Columns(final Collection<Column> columns) {
        this.columns = Objects.requireNonNull(columns);
    }

    public static Columns empty() {
        return new Columns(Collections.emptyList());
    }

    public Columns add(final Column column) {
        final List<Column> cols = new ArrayList<>(columns);
        cols.add(Objects.requireNonNull(column));
        return new Columns(cols);
    }
}
