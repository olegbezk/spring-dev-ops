package guru.springframework.bootstrap.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NonProfileBean {

    @Autowired
    public NonProfileBean(@Value("${custom.springframework.profile.message}") String message) {
        System.out.println("***********" + message + "*************");
    }
}
