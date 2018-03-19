package test.config.external.properties;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropertiesEnvironment {

    @Autowired
    private Environment environment;

    @Bean
    public FakeJmsBroker fakeJmsBrokerEnv() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(environment.getProperty("testing.jms.service"));
        fakeJmsBroker.setPort(environment.getRequiredProperty("testing.jms.port", Integer.class));
        fakeJmsBroker.setUser(environment.getProperty("testing.jms.user"));
        fakeJmsBroker.setPassword(environment.getProperty("testing.jms.password"));

        return  fakeJmsBroker;
    }
}
