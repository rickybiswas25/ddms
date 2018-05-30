package ddms.view.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by Deb
 * Date : 30/05/2018.
 */
@Scope(value = "session")
@Controller(value = "/design")
public class DesignViewController {

    public String design() {
        return "/design.xhtml";
    }
}
