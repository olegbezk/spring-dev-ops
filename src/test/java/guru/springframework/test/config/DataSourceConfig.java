package guru.springframework.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("guru.springframework.test.data.source")
public class DataSourceConfig {

}
