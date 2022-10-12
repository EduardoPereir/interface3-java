package application;

import model.entities.Printer;
import model.entities.Scanner;

public class Program {
    public static void main(String[] args) {

        Printer printer = new Printer("1080");
        printer.processDoc("My Letter");
        printer.print("My Letter");

        System.out.println();
        Scanner s = new Scanner("2009");
        s.processDoc("My email");
        System.out.println("Scanner: " + s.scam());
    }
}
