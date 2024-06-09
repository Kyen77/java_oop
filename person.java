public class person{

    private String Name;

    private String Password;

    @Override
    public String toString() {
        return "person{" +
                "Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    //Getter
    public String getName() {
        return Name;
    }

    public String getPassword(){
        return Password;
    }
    //Setter
    public void setName(String name) {this.Name = "kyenpia"; }
    public void setPassword(String password){this.Password = "246810";}

}
class Main{
    public static void main (String[]args){
        person myObj = new person();
        myObj.setPassword("246810");
        myObj.setName("Samuel"); //set the value of the name variable to Samuel
        System.out.println(myObj.getName());
        System.out.println(myObj.getPassword());
    }

}


