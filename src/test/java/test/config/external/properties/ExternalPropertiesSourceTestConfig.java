package test.config.external.properties;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:testing.properties")
public class ExternalPropertiesSourceTestConfig {

    @Value("${testing.jms.service}")
    private String jmsServer;

    @Value("${testing.jms.port}")
    private Integer jmsPort;

    @Value("${testing.jms.user}")
    private String jmsUser;

    @Value("${testing.jms.password}")
    private String jmsPassword;

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUrl(jmsServer);
        fakeJmsBroker.setPort(jmsPort);
        fakeJmsBroker.setUser(jmsUser);
        fakeJmsBroker.setPassword(jmsPassword);

        return  fakeJmsBroker;
    }
}
