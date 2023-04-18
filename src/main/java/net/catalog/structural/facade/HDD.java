package net.catalog.structural.facade;

public class HDD {
    public void copyFromDVD(DVDRom dvdRom){
        if (dvdRom.hasData()){
            System.out.println("Data copying from disk has started...");
        } else {
            System.out.println("Please connect the drive...");
        }
    }
}
