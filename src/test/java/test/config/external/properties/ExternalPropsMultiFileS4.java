package test.config.external.properties;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:testing.properties"),
        @PropertySource("classpath:encrypted-testing.properties")
})
public class ExternalPropsMultiFileS4 {

    @Autowired
    private Environment env;

    @Bean
    public FakeJmsBroker fakeJmsBrokerMulti(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(env.getProperty("testing.jms.service"));
        fakeJmsBroker.setPort(env.getRequiredProperty("testing.jms.port", Integer.class));
        fakeJmsBroker.setUser(env.getProperty("testing.jms.user"));
        fakeJmsBroker.setPassword(env.getProperty("testing.jms.encrypted.password"));

        return fakeJmsBroker;
    }
}
