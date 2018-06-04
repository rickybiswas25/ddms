package ddms.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Deb
 * Date : 04/06/2018.
 */
@Controller
public class WebController {
    private static final Logger LOG = LoggerFactory.getLogger(WebController.class);


    @RequestMapping("/design")
    public void design(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/design.jsf");
    }
}
