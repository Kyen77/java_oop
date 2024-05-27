public class person{

    private String Name;

    private String Password;

    //Getter
    public String getName() { 
        return Name;
     }

    public String getPassword(){
            return Password;
        }
     //Setter
     public void setName(String name) {this.Name = "kyenpia"; }
     public void setPassword(String password){this.password = "246810;"}
    
} 
class Main{
    public static void main (String[]args){
        Person myObj = new Person();
        myObj.setPassword("246810");
        myObj.setName("Samuel"); //set the value of the name variable to Samuel
    }
         
    }
}
