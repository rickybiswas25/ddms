package ddms.api.controller;

import com.google.common.collect.ImmutableList;
import ddms.api.entity.DesignEntity;
import ddms.api.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Deb
 * Date : 14/05/2018.
 */
@RestController
@RequestMapping("/api/design")
public class DesignController {

    @Autowired
    private DesignRepository designRepo;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public DesignEntity addDesign(@RequestBody DesignEntity designEntity) {
        return designRepo.save(designEntity);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.POST)
    public ImmutableList<DesignEntity> findAll() {
        return ImmutableList.copyOf(designRepo.findAll());
    }

}
