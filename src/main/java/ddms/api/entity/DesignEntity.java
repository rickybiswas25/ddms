package ddms.api.entity;

import ddms.api.converter.ValueConverter;
import ddms.api.value.DesignValue;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Deb
 * Date : 14/05/2018.
 */
@Entity
@Table(name = "design")
public class DesignEntity implements ValueConverter<DesignValue> {
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

    @Override
    public DesignValue toValue() {
        DesignValue design = new DesignValue();
        design.setCode(this.getCode());
        design.setDescription(this.getDescription());
        design.setFabricConsumption(this.getFabricConsumption());
        return design;
    }

    @Override
    public void fromValue(DesignValue value) {
        this.setCode(value.getCode());
        this.setDescription(value.getDescription());
        this.setFabricConsumption(value.getFabricConsumption());
    }
}
