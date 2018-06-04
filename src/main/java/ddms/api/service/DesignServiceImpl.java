package ddms.api.service;

import ddms.api.entity.DesignEntity;
import ddms.api.repository.DesignRepository;
import ddms.api.value.DesignValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Deb
 * Date : 29/05/2018.
 */
@Service
@Transactional
public class DesignServiceImpl implements DesignService {

    @Autowired
    private DesignRepository designRepo;

    @Override
    public DesignValue addDesign(DesignValue designValue) {
        DesignEntity entity = getDesignEntityFromValue(designValue);
        return designRepo.save(entity).toValue();
    }

    private DesignEntity getDesignEntityFromValue(DesignValue designValue) {
        DesignEntity entity = new DesignEntity();
        entity.fromValue(designValue);
        return entity;
    }

    @Override
    public List<DesignValue> findAll() {

        return designRepo.findAll().stream().map(DesignEntity::toValue).collect(Collectors.toList());
    }

    @Override
    public DesignValue find(String id) {
        Optional<DesignEntity> design = designRepo.findById(id);
        if (design.isPresent()) {
            return design.get().toValue();
        } else {
            new DesignEntity().toValue();
        }

        return null;
    }

    @Override
    public DesignValue update(DesignValue designValue) {
        DesignEntity entity = getDesignEntityFromValue(designValue);
        if (designRepo.existsById(entity.getCode())) {
            return  designRepo.save(entity).toValue();
        }
        return entity.toValue();
    }
}
