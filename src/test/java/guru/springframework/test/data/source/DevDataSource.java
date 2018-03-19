package guru.springframework.test.data.source;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDataSource implements FakeDataSource {

    @Override
    public String getConnectionInfo() {
        return "I'm the Dev data source.";
    }
}
