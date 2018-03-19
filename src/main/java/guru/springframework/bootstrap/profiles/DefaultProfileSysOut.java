package guru.springframework.bootstrap.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")
public class DefaultProfileSysOut {

    @Autowired
    public DefaultProfileSysOut( @Value("${custom.springframework.profile.message}") String message) {
        System.out.println("#########################");
        System.out.println("#########################");
        System.out.println("###      DEFAULT      ###");
        System.out.println(message);
        System.out.println("#########################");
        System.out.println("#########################");
    }
}
