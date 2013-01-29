package uk.ac.ox.it.cha.representations;

import com.cisco.axl.api._8.RSpeeddial;

/**
 *
 * @author martinfilliau
 */
public class Speeddial {

    private String index;
    private String dirn;
    
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
}
