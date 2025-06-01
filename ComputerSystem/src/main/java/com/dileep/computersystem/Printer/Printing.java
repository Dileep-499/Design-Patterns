package com.dileep.computersystem.Printer;

import com.dileep.computersystem.Builder.ComputerSystem;

public class Printing {

    public static void display(ComputerSystem computerSystem, String name) {
        StringBuilder sb = new StringBuilder();
        sb.append("---- ").append(name).append(" System Details ----\n");

        if (computerSystem.getCpu() != null) sb.append(" - CPU: ").append(computerSystem.getCpu()).append("\n");
        if (computerSystem.getGpu() != null) sb.append(" - GPU: ").append(computerSystem.getGpu()).append("\n");
        if (computerSystem.getRam() > 0)
            sb.append(" - RAM: ").append(computerSystem.getRam()).append(" GB\n");
        if (computerSystem.isHasHDD()) sb.append(" - Storage: HDD Present\n");
        if (computerSystem.isHasSSD()) sb.append(" - Storage: SSD Present\n");
        if (computerSystem.getOperatingSystem() != null)
            sb.append(" - Operating System: ").append(computerSystem.getOperatingSystem()).append("\n");
        if (computerSystem.isHasRGBLighting()) sb.append(" - RGB Lighting: Enabled\n");
        if (computerSystem.isHasLiquidCooling()) sb.append(" - Liquid Cooling: Installed\n");
        if (computerSystem.isHasWiFiCard()) sb.append(" - WiFi Card: Available\n");
        System.out.println(sb.toString());
    }

}
