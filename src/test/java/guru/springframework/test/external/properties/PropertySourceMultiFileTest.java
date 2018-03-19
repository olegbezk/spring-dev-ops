package guru.springframework.test.external.properties;

import guru.springframework.test.jms.FakeJmsBroker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.config.external.properties.ExternalPropsMultiFile;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExternalPropsMultiFile.class)
public class PropertySourceMultiFileTest {

    @Autowired
    private FakeJmsBroker fakeJmsBroker;

    @Test
    public void testPropsSet() {
        assertEquals("10.10.10.123", fakeJmsBroker.getUrl());
        assertEquals(3330, fakeJmsBroker.getPort().intValue());
        assertEquals("Ron", fakeJmsBroker.getUser());
        assertEquals("&%$)(*&#^!@!@#$", fakeJmsBroker.getPassword());
    }
}
