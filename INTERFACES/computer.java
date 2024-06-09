public class computer implements electronics {

    RAM ram;

    processor cpu;

    storage storage;

    public computer(RAM ram,processor cpu,storage storage){
        this.ram = ram
        this.cpu = cpu
        this.storage = storage;
    }
    @Override
    public boolean on(){
        return true;
    }
    @Override
    public boolean off(){
        return false;
    }

}
