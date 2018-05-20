package ddms.api.repository;

import ddms.api.entity.DesignEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Deb
 * Date : 14/05/2018.
 */
@Repository
public interface DesignRepository extends JpaRepository<DesignEntity, String> {
}
