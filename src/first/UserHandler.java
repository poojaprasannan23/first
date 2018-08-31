package first;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;


public class UserHandler extends DefaultHandler {
    boolean Name = false;
    boolean price = false;
    boolean description = false;
    boolean calories = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("food")) {
            String label = attributes.getValue("label");
            System.out.println("label:"+label);

        } else if (qName.equalsIgnoreCase("name")) {
            Name = true;

        } else if(qName.equalsIgnoreCase("price")){
            price=true;
        }else if(qName.equalsIgnoreCase("description")){
            description=true;
        }else if(qName.equalsIgnoreCase("calories")){
            calories=true;
        }
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if(qName.equalsIgnoreCase("food")){
            System.out.println("End Element:"+qName);
        }
        if(qName.equalsIgnoreCase("name")){
            System.out.println("End Element:"+qName);
        }
        if(qName.equalsIgnoreCase("price")){
            System.out.println("End Element:"+qName);
        }
        if(qName.equalsIgnoreCase("description")){
            System.out.println("End Element:"+qName);
        }
        if(qName.equalsIgnoreCase("calories")){
            System.out.println("End Element:"+qName);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (Name){
            String s=new String(ch,start,length);
            System.out.println("name:"+s);
            Name=false;
        }
        if(price){
            String s=new String(ch,start,length);
            System.out.println("price:"+s);
            price=false;
        }
        if(description){
            String s=new String (ch,start,length);
            System.out.println("description:"+s);
            description=false;
        }
        if(calories){
            String s=new String (ch,start,length);
            System.out.println("description:"+s);
            calories=false;
        }


    }

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        try {


            File inputFile = new File("sample.txt");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            UserHandler handler = new UserHandler();
            parser.parse(inputFile, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}