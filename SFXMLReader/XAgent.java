package SFXMLReader;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.util.*;

@XmlRootElement(name = "agent")
public class XAgent{
    double x,y,dx,dy,n;
    LinkedList<XAddWaypoint> addwaypoint = new LinkedList<XAddWaypoint>();
    
    public double getx(){
        return this.x;
    }
    public double gety(){
        return this.y;
    }
    public double getdx(){
        return this.dx;
    }
    public double getdy(){
        return this.dx;
    }
    public double getn(){
        return this.n;
    }
    public LinkedList<XAddWaypoint> getwp(){
        return this.addwaypoint;
    }
    
    @XmlAttribute(name = "x")
    public void setx(double x){
        this.x=x;
    }
    @XmlAttribute(name = "y")
    public void sety(double y){
        this.y=y;
    }
    @XmlAttribute(name = "dx")
    public void setdx(double dx){
        this.dx=dx;
    }
    @XmlAttribute(name = "dy")
    public void setdy(double dy){
        this.dy=dy;
    }
    @XmlAttribute(name = "n")
    public void setr(double n){
        this.n=n;
    }
    @XmlElement(name="addwaypoint")
    public void setwp(LinkedList<XAddWaypoint> x){
        this.addwaypoint=x;
    }
}
