package ddms.api.service;

import com.google.common.collect.ImmutableList;
import ddms.api.entity.DesignEntity;

/**
 * Created by Deb
 * Date : 29/05/2018.
 */
public interface DesignService {
    DesignEntity addDesign(DesignEntity designEntity);
    ImmutableList<DesignEntity> findAll();
    DesignEntity find(String id);
    DesignEntity update(DesignEntity entity);
}
