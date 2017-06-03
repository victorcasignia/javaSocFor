package SFXMLReader;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "waypoint")
//@XmlAccessorType(XmlAccessType.FIELD)
public class XWaypoint{
    String id;
    double x,y,r;
    
    public String getid(){
        return this.id;
    }
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public double getr(){
        return this.r;
    }
    @XmlAttribute(name = "id")
    public void setid(String id){
        this.id=id;
    }
    @XmlAttribute(name = "x")
    public void setx(double x){
        this.x=x;
    }
    @XmlAttribute(name = "y")
    public void sety(double y){
        this.y=y;
    }
    @XmlAttribute(name = "r")
    public void setr(double r){
        this.r=r;
    }

}
