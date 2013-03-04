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
        Phone phone = new Phone();
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

}
