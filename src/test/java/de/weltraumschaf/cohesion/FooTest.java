package de.weltraumschaf.cohesion;

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
        final Server server = new Server(URI.create("localhost:9999"), new User("sven", "test1234"));
        final ImportConfig config = new ImportConfig(
                new Table("src"),
                new Table("dst"),
                new Range(10, 20),
                Collections.EMPTY_LIST);

        final Importer sut = new Importer(server);

        assertThat(sut.importData(config), is(notNullValue()));
    }

}