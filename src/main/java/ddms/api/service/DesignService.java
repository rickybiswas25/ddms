package ddms.api.service;

import ddms.api.entity.DesignEntity;
import ddms.api.value.DesignValue;

import java.util.List;

/**
 * Created by Deb
 * Date : 29/05/2018.
 */
public interface DesignService {
    DesignValue addDesign(DesignValue designEntity);
    List<DesignValue> findAll();
    DesignValue find(String id);
    DesignValue update(DesignValue entity);
}
