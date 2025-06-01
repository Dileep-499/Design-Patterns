package com.dileep.computersystem;

import com.dileep.computersystem.Builder.ComputerSystem;
import com.dileep.computersystem.Printer.Printing;

import java.util.Scanner;

public class User {
    public static void  main(String[] args){
       ComputerSystem computer=null;
       Scanner scanner= new Scanner(System.in);
       String name=scanner.next();
              computer = new ComputerSystem.Builder()
                .cpu("Intel i7")
                .gpu("NVIDIA")
                .ram(16)
                .hasHDD(true)
                .hasSSD(true)
                .operatingSystem("Windows")
                .hasRGBLighting(true)
                .hasLiquidCooling(false)
                .hasWiFiCard(true)
                .build();
        Printing.display(computer,name);
        System.out.println("------------------------");
        name=scanner.next();
        computer=new ComputerSystem.Builder()
                .cpu("AMD Ryzen")
                .gpu("AMD")
                .ram(32)
                .hasSSD(true)
                .operatingSystem("Linux")
                .hasRGBLighting(true)
                .hasLiquidCooling(true)
                .build();
        Printing.display(computer,name);


    }
}
