package ddms.api.service;

import com.google.common.collect.ImmutableList;
import ddms.api.entity.DesignEntity;
import ddms.api.repository.DesignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Deb
 * Date : 29/05/2018.
 */
@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    private DesignRepository designRepo;

    @Override
    public DesignEntity addDesign(DesignEntity designEntity) {
        return designRepo.save(designEntity);
    }

    @Override
    public ImmutableList<DesignEntity> findAll() {
        return ImmutableList.copyOf(designRepo.findAll());
    }

    @Override
    public DesignEntity find(String id) {
        return designRepo.findById(id).orElse(new DesignEntity());
    }

    @Override
    public DesignEntity update(DesignEntity entity) {
        if (designRepo.existsById(entity.getCode())) {
            designRepo.save(entity);
        }
        return null;
    }
}
