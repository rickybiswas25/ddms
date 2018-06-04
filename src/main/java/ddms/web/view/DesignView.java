package ddms.web.view;

import ddms.api.service.DesignService;
import ddms.api.value.DesignValue;
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

    private DesignValue designValue = new DesignValue();

    private List<DesignValue> designs;

    @PostConstruct
    public void init() {
        designs = designService.findAll();
    }

    public List<DesignValue> getDesigns() {
        return designs;
    }

    public void setDesigns(List<DesignValue> designs) {
        this.designs = designs;
    }

    public DesignValue getDesignValue() {
        return designValue;
    }

    public void setDesignValue(DesignValue designValue) {
        this.designValue = designValue;
    }

    public List<DesignValue> findAll() {
        return designs;
    }

    public DesignValue addDesign() {
        return designService.addDesign(designValue);
    }
}
