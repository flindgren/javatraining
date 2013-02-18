package stuff;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class SomethingTest {

    @Test
    public void shouldWork() {
        assertThat("does not work", new Work().execute(), Is.is(false));
    }

}
