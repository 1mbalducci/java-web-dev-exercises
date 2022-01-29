package exercises.technology;

public class Computer<pubic> extends AbstractEntity{
    private String companyName= "MB Computers Inc.";
    private int ram;
    private int storage;

    public Computer (int ram, int storage){
        super();
        this.ram= ram;
        this.storage= storage;
        this.companyName=companyName;
    }

    public void setRam(int ramToAdd) {
        this.ram = ram + ramToAdd;
    }
    public int getRam(int ram){
       return ram;
    }

    public String getCompanyName(String companyName){
        return companyName;
    }

    public void setStorage(int newStorage){
        this.storage = storage + newStorage;
    }

    public int getStorage( int storage){
        return storage;
    }

    public void addRam(int newRam){
        setRam(newRam);
    }

    public void addStorage(int newStorage){
        setStorage(newStorage);
    }
}
