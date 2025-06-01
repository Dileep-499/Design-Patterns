package com.dileep.computersystem.Builder;


public class ComputerSystem {
    public static class Builder{
        private String cpu; 
        private String gpu; 
        private int ram; 
        private boolean hasHDD;
        private boolean hasSSD;
        private String operatingSystem;
        private boolean hasRGBLighting;
        private boolean hasLiquidCooling;
        private boolean hasWiFiCard;

        public ComputerSystem build(){
            return new ComputerSystem(this);
        }
        
        public Builder cpu(String cpu){
            this.cpu=cpu;
            return this;
        }
        public Builder gpu(String gpu){
            this.gpu=gpu;
            return this;
        }
        public Builder ram(int ram){
            this.ram=ram;
            return this;
        }
        public Builder hasHDD(boolean hasHDD){
            this.hasHDD=hasHDD;
            return this;
        }
        public Builder hasSSD(boolean hasSSD){
            this.hasSSD=hasSSD;
            return this;
        }
        public Builder operatingSystem(String operatingSystem){
            this.operatingSystem=operatingSystem;
            return this;
        }
        public Builder hasRGBLighting(boolean hasRGBLighting){
            this.hasRGBLighting=hasRGBLighting;
            return this;
        }
        public Builder hasLiquidCooling(boolean hasLiquidCooling){
            this.hasLiquidCooling=hasLiquidCooling;
            return this;
        }
        public Builder hasWiFiCard(boolean hasWiFiCard){
            this.hasWiFiCard=hasWiFiCard;
            return this;
        }
        
    }
    private String cpu; // CPU options: "Intel i5", "Intel i7", "AMD Ryzen"
    private String gpu; // GPU options: "NVIDIA", "AMD", or "None"
    private int ram; // RAM options: 8, 16, 32 (in GB)
    // Storage options: could have both HDD and SSD
    private boolean hasHDD;
    private boolean hasSSD;

    private String operatingSystem;// OS options: "Windows", "Linux", or "None"
    
    // Additional features
    private boolean hasRGBLighting;
    private boolean hasLiquidCooling;
    private boolean hasWiFiCard;
    
    public ComputerSystem(Builder builder){
        this.cpu=builder.cpu;
        this.gpu=builder.gpu;
        this.ram=builder.ram;
        this.hasHDD=builder.hasHDD;
        this.hasSSD=builder.hasSSD;
        this.operatingSystem=builder.operatingSystem;
        this.hasLiquidCooling=builder.hasLiquidCooling;
        this.hasRGBLighting=builder.hasRGBLighting;
        this.hasWiFiCard=builder.hasWiFiCard;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isHasHDD() {
        return hasHDD;
    }

    public void setHasHDD(boolean hasHDD) {
        this.hasHDD = hasHDD;
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public boolean isHasRGBLighting() {
        return hasRGBLighting;
    }

    public void setHasRGBLighting(boolean hasRGBLighting) {
        this.hasRGBLighting = hasRGBLighting;
    }

    public boolean isHasLiquidCooling() {
        return hasLiquidCooling;
    }

    public void setHasLiquidCooling(boolean hasLiquidCooling) {
        this.hasLiquidCooling = hasLiquidCooling;
    }

    public boolean isHasWiFiCard() {
        return hasWiFiCard;
    }

    public void setHasWiFiCard(boolean hasWiFiCard) {
        this.hasWiFiCard = hasWiFiCard;
    }
}
