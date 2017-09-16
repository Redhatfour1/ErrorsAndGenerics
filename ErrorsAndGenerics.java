import java.util.*;

public class ErrorsAndGenerics {
  public static void main(String[] args) {
    User newUser = new User ("lhaywood");

    try{
      newUser.login();
    } catch(UserException userException){
      System.out.println(userException + ": " + userException.description);
    } catch(Exception exception){
      System.out.println(exception);
    }
  }
}
