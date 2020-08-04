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

    final class User {
        private final String name;
        private final String password;

        User(final String name, final String password) {
            this.name = Objects.requireNonNull(name);
            this.password = Objects.requireNonNull(password);
        }
    }

    final class Server {
        private final URI url;
        private final User user;

        Server(final URI url, final User user) {
            this.url = Objects.requireNonNull(url);
            this.user = Objects.requireNonNull(user);
        }
    }

    final class Table {
        private final String name;

        Table(String name) {
            this.name = Objects.requireNonNull(name);
        }

        public String getName() {
            return name;
        }
    }

    final class Range {
        private final int start;
        private final int end;

        Range(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

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

    final class OutInfo {
        final String errorMsg;
        final int importedRows;
        final boolean successfull;

        OutInfo(String errorMsg, int importedRows, boolean successfull) {
            this.errorMsg = errorMsg;
            this.importedRows = importedRows;
            this.successfull = successfull;
        }

    }
    final class Importer {
        private final Server server;

        Importer(final Server server) {
            this.server = Objects.requireNonNull(server);
        }

        OutInfo importData(final ImportConfig config) {
            // do something.
            return new OutInfo("", 0, true);
        }
    }

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