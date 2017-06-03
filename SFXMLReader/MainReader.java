package SFXMLReader;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.util.*;
import java.io.*;
import java.lang.NullPointerException;

public class MainReader{
    static public XMLReader temp;
    static public File file;
    public MainReader(String fileName){
        try{
            file = new File(fileName);
        }
        catch(Exception e){
        
        }
    }
    public static void readXML(){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(XMLReader.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            temp = (XMLReader) jaxbUnmarshaller.unmarshal(file);
            //System.out.println(temp.wa.size());
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
