package ddms.api.controller;

import com.google.common.collect.ImmutableList;
import ddms.api.entity.DesignEntity;
import ddms.api.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public DesignEntity addDesign(@RequestBody DesignEntity designEntity) {
        return designService.addDesign(designEntity);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public ImmutableList<DesignEntity> findAll() {
        return designService.findAll();
    }

    @RequestMapping(value = "/find/{id}", method = RequestMethod.POST)
    public DesignEntity find(@PathVariable(value = "id") String id) {
        return designService.find(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public DesignEntity update(@RequestBody DesignEntity entity) {
        return designService.update(entity);
    }
}
