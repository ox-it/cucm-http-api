package uk.ac.ox.it.cha.representations;

import com.cisco.axl.api._8.RSpeeddial;
import com.cisco.axl.api._8.XSpeeddial;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author martinfilliau
 */
public class Speeddial {

    @JsonProperty
    private String index;
    
    @JsonProperty
    private String dirn;
    
    @JsonProperty
    private String label;

    public Speeddial() {
        
    }
    
    public Speeddial(RSpeeddial sd) {
        this.index = sd.getIndex();
        this.dirn = sd.getDirn();
        this.label = sd.getLabel();
    }
    
    @JsonIgnore
    public XSpeeddial getXSpeeddial() {
        XSpeeddial xs = new XSpeeddial();
        xs.setDirn(this.dirn);
        xs.setIndex(this.index);
        xs.setAsciiLabel(this.label);
        xs.setLabel(this.label);
        return xs;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (o instanceof Speeddial) {
            return this.hashCode() == o.hashCode();
        } 
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.index != null ? this.index.hashCode() : 0);
        hash = 41 * hash + (this.dirn != null ? this.dirn.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " [" + this.getIndex() + "=>" + this.getDirn() + "]";
    }
    
    /* GETTERS and SETTERS */
    
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getDirn() {
        return dirn;
    }

    public void setDirn(String dirn) {
        this.dirn = dirn;
    }
    
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
