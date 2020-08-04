package de.weltraumschaf.cohesion;

import de.weltraumschaf.cohesion.datadefiniton.Column;
import de.weltraumschaf.cohesion.datadefiniton.Columns;
import de.weltraumschaf.cohesion.datadefiniton.Table;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

/**
 *
 */
class FooTest {

    @Test
    void importData() {
        final Server server = new Server(URI.create("localhost:9999"), new User("sven", "test1234".getBytes()));
        final ImportConfig config = new ImportConfig(
                Table.from("src"),
                Table.from("dst"),
                new Range(10, 20),
                Columns.empty()
                    .add(Column.from("foo"))
                    .add(Column.from("bar"))
                    .add(Column.from("baz")));

        final Importer sut = new Importer(server);

        assertThat(sut.importData(config), is(notNullValue()));
    }

}