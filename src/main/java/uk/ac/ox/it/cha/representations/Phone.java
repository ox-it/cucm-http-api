package uk.ac.ox.it.cha.representations;

import com.cisco.axl.api._8.GetPhoneRes;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author martinfilliau
 */
public class Phone {
    
    @JsonProperty
    private String product;
    
    @JsonProperty
    private String description;
    
    @JsonProperty
    private String model;
    
    @JsonProperty
    private String name;
    
    @JsonProperty
    private String uuid;

    public Phone() {
        
    }
    
    /**
     * Build a Phone object from a GetPhoneRes object
     * @param gpr GetPhoneRes object
     */
    public Phone(GetPhoneRes gpr) {
        this.description = gpr.getReturn().getPhone().getDescription();
        this.model = gpr.getReturn().getPhone().getModel();
        this.name = gpr.getReturn().getPhone().getName();
        this.product = gpr.getReturn().getPhone().getProduct();
        this.uuid = gpr.getReturn().getPhone().getUuid();
    }
    
    /* GETTERS and SETTERS */
    
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    
}
