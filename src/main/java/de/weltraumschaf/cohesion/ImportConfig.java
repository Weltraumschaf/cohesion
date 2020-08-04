package de.weltraumschaf.cohesion;

import de.weltraumschaf.cohesion.datadefiniton.Column;
import de.weltraumschaf.cohesion.datadefiniton.Table;

import java.util.Collection;
import java.util.Objects;

/**
 *
 */
final class ImportConfig {

    private final Table source;
    private final Table target;
    private final Range rows;
    private final Collection<Column> columns;

    ImportConfig(final Table source, final Table target, Range rows, Collection<Column> columns) {
        super();
        this.source = Objects.requireNonNull(source);
        this.target = Objects.requireNonNull(target);
        this.rows = Objects.requireNonNull(rows);
        this.columns = Objects.requireNonNull(columns);
    }
}
