package guru.springframework.bootstrap.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdProfileSysOut {

    @Autowired
    public ProdProfileSysOut( @Value("${custom.springframework.profile.message}") String message) {
        System.out.println("#########################");
        System.out.println("#########################");
        System.out.println("###        PROD       ###");
        System.out.println(message);
        System.out.println("#########################");
        System.out.println("#########################");
    }
}
