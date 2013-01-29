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
    
    public Speeddial() {
        
    }
    
    public Speeddial(RSpeeddial sd) {
        this.index = sd.getIndex();
        this.dirn = sd.getDirn();
    }

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
    
    @JsonIgnore
    public XSpeeddial getXSpeeddial() {
        XSpeeddial xs = new XSpeeddial();
        xs.setAsciiLabel(this.dirn);
        xs.setDirn(this.dirn);
        xs.setIndex(this.index);
        xs.setLabel(this.dirn);
        return xs;
    }
}
