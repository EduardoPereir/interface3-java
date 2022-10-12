package model.entities;

public class concreteScanner extends Device{

    public concreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc );
    }

    public String scan(){
        return "Scanned content";
    }

}
