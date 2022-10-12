package model.entities;

import org.w3c.dom.ls.LSOutput;

public class Scanner extends Device{

    public Scanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc );
    }

    public String scam(){
        return "Scanned content";
    }

}
