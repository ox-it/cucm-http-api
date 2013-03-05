package uk.ac.ox.it.cha.representations;

import com.cisco.axl.api._8.RSpeeddial;
import com.cisco.axl.api._8.XSpeeddial;
import static com.yammer.dropwizard.testing.JsonHelpers.*;
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
        sd.setLabel("label");
        assertThat("a Speeddial can be serialized to JSON",
                asJson(sd),
                is(equalTo(jsonFixture("fixtures/speeddial.json"))));
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        final Speeddial sd = new Speeddial();
        sd.setDirn("dirn");
        sd.setIndex("index");
        sd.setLabel("label");
        assertThat("a Speeddial can be deserialized from JSON",
                fromJson(jsonFixture("fixtures/speeddial.json"), Speeddial.class),
                is(sd));
    }
    
    @Test
    public void testRSpeeddialRepresentation() throws Exception {
        final Speeddial sd = new Speeddial();
        sd.setDirn("dirn");
        sd.setIndex("index");
        sd.setLabel("label");
        RSpeeddial rs = new RSpeeddial();
        rs.setAsciiLabel("label");
        rs.setDirn("dirn");
        rs.setIndex("index");
        rs.setLabel("label");
        Speeddial test = new Speeddial(rs);
        assertThat("Speeddial from RSpeeddial", 
                test, is(sd));
    }
    
    @Test
    public void testXSpeeddialRepresentation() throws Exception {
        XSpeeddial xs = new XSpeeddial();
        xs.setDirn("dirn");
        xs.setIndex("index");
        xs.setAsciiLabel("label");
        xs.setLabel("label");
        final Speeddial sd = new Speeddial();
        sd.setDirn("dirn");
        sd.setIndex("index");
        sd.setLabel("label");
        XSpeeddial from = sd.getXSpeeddial();
        assertEquals(from.getAsciiLabel(), xs.getAsciiLabel());
        assertEquals(from.getDirn(), xs.getDirn());
        assertEquals(from.getIndex(), xs.getIndex());
        assertEquals(from.getLabel(), xs.getLabel());
    }
}
