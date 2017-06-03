package SFXMLReader;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="obstacle")
public class XWall{
    double x1,y1,x2,y2;
    
    public double getx1(){
        return this.x1;
    }
    public double gety1(){
        return this.y1;
    }
    public double getx2(){
        return this.x2;
    }
    public double gety2(){
        return this.y2;
    }
    
    @XmlAttribute(name="x1")
    public void setx1(double x1){
        this.x1=x1;
    }
    @XmlAttribute(name="y1")
    public void sety1(double y1){
        this.y1=y1;
    }
    @XmlAttribute(name="x2")
    public void setx2(double x2){
        this.x2=x2;
    }
    @XmlAttribute(name="y2")
    public void sety2(double y2){
        this.y2=y2;
    }
    
}
