package com.cydeo.looselycoupled;

import com.cydeo.looselycoupled.caseFactory.Case;
import com.cydeo.looselycoupled.caseFactory.DellCase;
import com.cydeo.looselycoupled.monitorFactory.AcerMonitor;
import com.cydeo.looselycoupled.monitorFactory.Monitor;
import com.cydeo.looselycoupled.motherboardFactory.AsusMotherboard;
import com.cydeo.looselycoupled.motherboardFactory.Motherboard;

public class Main {
    public static void main(String[] args) {

        Monitor theMonitor = new AcerMonitor("27inch Beast", "Acer", 27);
        Case theCase = new DellCase("220B", "Dell", "240");
        Motherboard theMotherboard = new AsusMotherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC myPc = new PC(theCase,theMonitor,theMotherboard);

        myPc.powerUp();
    }
}
