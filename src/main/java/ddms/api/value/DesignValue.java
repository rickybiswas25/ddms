package ddms.api.value;

import org.springframework.stereotype.Component;

/**
 * Created by Deb
 * Date : 04/06/2018.
 */
@Component
public class DesignValue {
    private String code;
    private String description;
    private String fabricConsumption;

    public DesignValue() {}

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
