package application;

import model.entities.ComboDevice;
import model.entities.concretePrinter;
import model.entities.concreteScanner;

public class Program {
    public static void main(String[] args) {

        concretePrinter printer = new concretePrinter("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");

        System.out.println();
        concreteScanner s = new concreteScanner("2009");
        s.processDoc("My email");
        System.out.println(s.scan());

        System.out.println();
        ComboDevice cd = new ComboDevice("1331");
        cd.print("Cd testing");
        cd.processDoc("Cd testing");
        System.out.println("Cd testing: " + cd.scan());
    }
}
