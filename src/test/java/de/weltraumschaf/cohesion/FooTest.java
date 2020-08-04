package de.weltraumschaf.cohesion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 *
 */
class FooTest {

    @Test
    void foo() {
        assertThat(false, is(true));
    }

}