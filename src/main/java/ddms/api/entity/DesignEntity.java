package ddms.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Deb
 * Date : 14/05/2018.
 */
@Entity
@Table(name = "design")
public class DesignEntity {
    @Id
    private String code;
    private String description;
    private String fabricConsumption;

    public DesignEntity() {}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFabricConsumption() {
        return fabricConsumption;
    }

    public void setFabricConsumption(String name) {
        this.fabricConsumption = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
