package foundation.stack.echo;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Israel Colomer (israelcolomer@gmail.com)
 */
@RestController
public class EchoController {

    @GetMapping(path = "/echo/{msg}")
    public HttpEntity<String> echo(@PathVariable String msg) {
        return new HttpEntity<String>(msg);
    }
}
