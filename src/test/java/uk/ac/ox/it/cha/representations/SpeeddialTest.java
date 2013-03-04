package uk.ac.ox.it.cha.representations;

import static com.yammer.dropwizard.testing.JsonHelpers.*;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martinfilliau
 */
public class SpeeddialTest {
    
    @Test
    public void serializesToJSON() throws Exception {
        final Speeddial sd = new Speeddial();
        sd.setDirn("dirn");
        sd.setIndex("index");
        assertThat("a Speeddial can be serialized to JSON",
                asJson(sd),
                is(equalTo(jsonFixture("fixtures/speeddial.json"))));
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        final Speeddial sd = new Speeddial();
        sd.setDirn("dirn");
        sd.setIndex("index");
        assertThat("a Speeddial can be deserialized from JSON",
                fromJson(jsonFixture("fixtures/speeddial.json"), Speeddial.class),
                is(sd));
    }
}
