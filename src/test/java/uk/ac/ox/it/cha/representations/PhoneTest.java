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
public class PhoneTest {

    @Test
    public void serializesToJSON() throws Exception {
        final Phone phone = new Phone();
        phone.setName("name");
        phone.setModel("model");
        phone.setProduct("product");
        phone.setDescription("description");
        phone.setUuid("uuid");
        List<String> dirns = new ArrayList<String>();
        dirns.add("dirn");
        phone.setDirns(dirns);
        assertThat("a Phone can be serialized to JSON",
                asJson(phone),
                is(equalTo(jsonFixture("fixtures/phone.json"))));
    }

    @Test
    public void deserializesFromJSON() throws Exception {
        final Phone phone = new Phone();
        phone.setName("name");
        phone.setModel("model");
        phone.setProduct("product");
        phone.setDescription("description");
        phone.setUuid("uuid");
        List<String> dirns = new ArrayList<String>();
        dirns.add("dirn");
        phone.setDirns(dirns);
        
        Phone p = fromJson(jsonFixture("fixtures/phone.json"), Phone.class);
        System.out.println(p.equals(phone));
        System.out.println(p.hashCode());
        System.out.println(phone.hashCode());
        
        assertThat("a Phone can be deserialized from JSON",
                fromJson(jsonFixture("fixtures/phone.json"), Phone.class),
                is(phone));
    }
}
