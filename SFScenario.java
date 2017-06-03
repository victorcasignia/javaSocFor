import java.util.*;
import java.io.File;
import SFXMLReader.*;
import java.io.*;

public class SFScenario{
    public static double fRand(double lower, double upper)
    {
        return Math.random() * (upper - lower) + lower;
    }
    
    public static LinkedList<SFAgent> agents;
    public static LinkedList<SFWall> walls;
    public static LinkedList<SFWaypoint> waypoints;
    public static void moveAgents(){
        for(SFAgent temp: agents) temp.move(agents, walls);
    }
    public static void printInfo(){
        for(SFAgent temp: agents) temp.printInfo();
    }
    public static String getInfo(){
        String toReturn = new String();
        for(SFAgent temp: agents) toReturn = new StringBuilder().append(toReturn).append(temp.getInfo()).toString();
        return toReturn;
    }
    public SFScenario(){
        agents = new LinkedList<SFAgent>();
        walls = new LinkedList<SFWall>();
        waypoints = new LinkedList<SFWaypoint>();
    }
    public static LinkedList<SFWaypoint> searchByID(LinkedList<XAddWaypoint> x){
        LinkedList<SFWaypoint> toReturn = new LinkedList<SFWaypoint>();
        for(int i=0;i<x.size();i++){
            for(int j=0;j<waypoints.size();j++){
                if(x.get(i).getid().equals(waypoints.get(j).id)){
                    toReturn.addFirst(waypoints.get(j));
                }
            }
        }
        return toReturn;
    }
    public static void readFromXML(String XMLFile){
        
        LinkedList<XWall> rwall = new LinkedList<XWall>();
        LinkedList<XAgent> ragent = new LinkedList<XAgent>();
        LinkedList<XWaypoint> rwaypoint = new LinkedList<XWaypoint>();
        
        //set parameters here
        double tau = 0.5;
        double mass = 1;
        
        MainReader rd = new MainReader(XMLFile);
        rd.readXML();
        
        if(rd!=null){
            rwall=rd.temp.getwa();
            ragent=rd.temp.getag();
            rwaypoint=rd.temp.getwp();
        }
        //add walls to scenarios
        for(XWall temp: rwall){
            SFWall newWall = new SFWall(temp.getx1(), temp.gety1(), temp.getx2(), temp.gety2());
            walls.addFirst(newWall);
        }
        //add waypoints to scenarios
        for(XWaypoint temp: rwaypoint){
            SFWaypoint newWaypoint = new SFWaypoint(temp.getid(), temp.getx(), temp.gety(), temp.getr());
            waypoints.addFirst(newWaypoint);
        }
        //add agents to scenario
        int tempid=0;
        for(XAgent temp: ragent){
            for(int i=0; i<temp.getn(); i++){
                SFAgent newAgent = new SFAgent(tempid++, tau, new SFVector(fRand(temp.getx()-temp.getdx(), temp.getx()+temp.getdx()),
                                                                       fRand(temp.gety()-temp.getdy(), temp.gety()+temp.getdy())),
                                               searchByID(temp.getwp()), new SFVector(fRand(1.2, 1.6), 0), mass);
                agents.add(newAgent);
            }
            
        }
    }

}
