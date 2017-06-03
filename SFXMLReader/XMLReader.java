package SFXMLReader;

import java.util.*;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="welcome")
public class XMLReader{
    private LinkedList<XWaypoint> wp = new LinkedList<XWaypoint>();
    private LinkedList<XAgent> ag = new LinkedList<XAgent>();
    private LinkedList<XWall> wa = new LinkedList<XWall>();
    
    public LinkedList<XWaypoint> getwp(){
        return this.wp;
    }
    
    public LinkedList<XAgent> getag(){
        return this.ag;
    }
    
    public LinkedList<XWall> getwa(){
        return this.wa;
    }
    
    @XmlElement(name="waypoint")
    public void setwp(LinkedList<XWaypoint> x){
        this.wp=x;
    }
    @XmlElement(name="agent")
    public void setag(LinkedList<XAgent> x){
        this.ag=x;
    }
    @XmlElement(name="obstacle")
    public void setwa(LinkedList<XWall> x){
        this.wa=x;
    }
    
}
