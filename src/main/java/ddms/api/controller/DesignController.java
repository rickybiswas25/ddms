package ddms.api.controller;

import ddms.api.entity.DesignEntity;
import ddms.api.service.DesignService;
import ddms.api.value.DesignValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Deb
 * Date : 14/05/2018.
 */
@RestController
@RequestMapping("/api/design")
public class DesignController {

    @Autowired
    private DesignService designService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public DesignValue addDesign(@RequestBody DesignValue designValue) {
        return designService.addDesign(designValue);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public List<DesignValue> findAll() {
        return designService.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.POST)
    public DesignValue find(@PathVariable(value = "id") String id) {
        return designService.find(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public DesignValue update(@RequestBody DesignValue designValue) {
        return designService.update(designValue);
    }
}
