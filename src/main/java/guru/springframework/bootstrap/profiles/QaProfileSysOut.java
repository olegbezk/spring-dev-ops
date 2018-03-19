package guru.springframework.bootstrap.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QaProfileSysOut {

    public QaProfileSysOut() {
        System.out.println("#########################");
        System.out.println("#########################");
        System.out.println("###        QA         ###");
        System.out.println("#########################");
        System.out.println("#########################");
    }
}
