package model.entities;

public class concretePrinter extends Device {

    public concretePrinter(String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Printer processing: " + doc);
    }

    public void print(String doc){
        System.out.println("Printing: " + doc);
    }
}
