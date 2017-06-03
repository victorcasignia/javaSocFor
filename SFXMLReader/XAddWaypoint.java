package SFXMLReader;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.*;

@XmlRootElement(name = "addwaypoint")
public class XAddWaypoint{
    String id;
    
    public String getid(){
        return this.id;
    }
    @XmlAttribute(name = "id")
    public void setid(String id){
        this.id=id;
    }
}
