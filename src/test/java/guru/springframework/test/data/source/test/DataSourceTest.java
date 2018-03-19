package guru.springframework.test.data.source.test;

import guru.springframework.test.config.DataSourceConfig;
import guru.springframework.test.data.source.FakeDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DataSourceConfig.class)
//@ActiveProfiles("prod")
public class DataSourceTest {

    private FakeDataSource fakeDataSource;

    @Autowired
    public void setFakeDataSource(final FakeDataSource fakeDataSource) {
        this.fakeDataSource = fakeDataSource;
    }

    @Test
    public void testDataSource() {
        System.out.println(fakeDataSource.getConnectionInfo());
    }
}
