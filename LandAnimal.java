public class LandAnimal extends Animal{
    @override
    String move(){
        return "Swings on a tree";
    }
    public static void main(String[]args){
        LandAnimal lion = new LandAnimal()
        //lion.name = "Sammy";
        LandAnimal monkey = new LandAnimal();
        system.out.println(lion.move());
        system.ot.println(monkey.move());

    }
}