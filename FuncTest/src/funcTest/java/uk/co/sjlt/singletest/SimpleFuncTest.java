package uk.co.sjlt.singletest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleFuncTest {

    @Test
    void funcTestSimpleMethod ()
    {
        assertEquals (2, Simple.simpleMethod(1, 1));
    }
}
