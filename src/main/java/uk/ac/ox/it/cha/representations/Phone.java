package uk.ac.ox.it.cha.representations;

import com.cisco.axl.api._8.GetPhoneRes;
import com.cisco.axl.api._8.RPhone;
import com.cisco.axl.api._8.RPhoneLine;
import com.cisco.axl.api._8.RSpeeddial;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a Phone
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
    
    @JsonProperty
    private List<String> dirns;
    
    @JsonProperty
    private List<Speeddial> speeddials;

    @JsonProperty
    private String buttonsNumber;

    @JsonProperty
    private String softKeyTemplateName;

    public Phone() {
        
    }
    
    /**
     * Build a Phone object from a GetPhoneRes object
     * @param gpr GetPhoneRes object
     */
    public Phone(GetPhoneRes gpr) {
        RPhone phone = gpr.getReturn().getPhone();
        this.description = phone.getDescription();
        this.model = phone.getModel();
        this.name = phone.getName();
        this.product = phone.getProduct();
        this.uuid = phone.getUuid();
        RPhone.Lines lines = phone.getLines();
        this.dirns = new ArrayList<String>();
        for (RPhoneLine l : lines.getLine()) {
            this.dirns.add(l.getDirn().getPattern());            
        }
        RPhone.Speeddials sds = phone.getSpeeddials();
        this.speeddials = new ArrayList<Speeddial>();
        for (RSpeeddial sd : sds.getSpeeddial()) {
            this.speeddials.add(new Speeddial(sd));
        }
        this.buttonsNumber = phone.getNumberOfButtons();
        this.softKeyTemplateName = phone.getSoftkeyTemplateName().getValue();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (o instanceof Phone) {
            return this.hashCode() == o.hashCode();
        } 
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + (this.product != null ? this.product.hashCode() : 0);
        hash = 59 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 59 * hash + (this.model != null ? this.model.hashCode() : 0);
        hash = 59 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 59 * hash + (this.uuid != null ? this.uuid.hashCode() : 0);
        hash = 59 * hash + (this.dirns != null ? this.dirns.hashCode() : 0);
        hash = 59 * hash + (this.speeddials != null ? this.speeddials.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [" + this.getName() + "]";
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
    
    public List<String> getDirns() {
        return dirns;
    }

    public void setDirns(List<String> dirns) {
        this.dirns = dirns;
    }
    
    public List<Speeddial> getSpeeddials() {
        return speeddials;
    }

    public void setSpeeddials(List<Speeddial> speeddials) {
        this.speeddials = speeddials;
    }

    public String getButtonsNumber() {
        return buttonsNumber;
    }

    public void setButtonsNumber(String buttonsNumber) {
        this.buttonsNumber = buttonsNumber;
    }

    public String getSoftKeyTemplateName() {
        return softKeyTemplateName;
    }

    public void setSoftKeyTemplateName(String softKeyTemplateName) {
        this.softKeyTemplateName = softKeyTemplateName;
    }
}
