package de.weltraumschaf.cohesion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 *
 */
final class ImportConfig {
    private final Table source;
    private final Table target;
    private final Range rows;
    private final Collection<String> columNames;

    ImportConfig(final Table source, final Table target, Range rows, Collection<String> columNames) {
        super();
        this.source = Objects.requireNonNull(source);
        this.target = Objects.requireNonNull(target);
        this.rows = Objects.requireNonNull(rows);
        this.columNames = new ArrayList<>(columNames);
    }
}
