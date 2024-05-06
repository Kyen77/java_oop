public class User {
    String username = "kyenpia";
    String password = "pass";
    String login(){
        if (username.equals("kyenpia") && password.equals("pass")){
            return "Logged in";
        }
        else {
            return "Failed to log in";
        }
    }
    public static void main(String[]args){
        User sam = new User();
        System.out.println(sam.login());
    }
    
}
