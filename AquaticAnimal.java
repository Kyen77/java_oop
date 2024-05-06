public class AquaticAnimal extends Animal{
    @override
    String move(){
        return "Moves by swimming";
    }
    String name = "Whale";
    public static void main(string[]args){
        AquaticAnimal Whale = new AquaticAnimal();
        System.out.println(whale.name +""+ Whalemove());
    }
}