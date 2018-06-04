package ddms.web.view;

import ddms.api.entity.DesignEntity;
import ddms.api.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Deb
 * Date : 30/05/2018.
 */
@Component(value = "designView")
public class DesignView {

    @Autowired
    private DesignService designService;


    private List<DesignEntity> designs;

    @PostConstruct
    public void init() {
        designs = designService.findAll();
    }

    public List<DesignEntity> getDesigns() {
        return designs;
    }

    public void setDesigns(List<DesignEntity> designs) {
        this.designs = designs;
    }

    public List<DesignEntity> findAll() {
        return designs;
    }
}
