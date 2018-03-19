package guru.springframework.test;

import guru.springframework.test.jms.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBootJavaConfig {

    @Value("${testing.jms.service}")
    private String jmsServer;

    @Value("${testing.jms.port}")
    private Integer jmsPort;

    @Value("${testing.jms.user}")
    private String jmsUser;

    @Value("${testing.jms.password}")
    private String jmsPassword;

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
