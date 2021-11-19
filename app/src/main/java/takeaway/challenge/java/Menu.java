package takeaway.challenge.java;
import java.util.HashMap;


public class Menu {
    public  HashMap<String, Integer> menu;
    public Menu(){
       this.menu = new HashMap<>() {{
            put("piza", 10);
            put("pasta", 8);
            put("salad", 5);
        }};
    }
    
    
    public String loopingKeys(){
        for (String i : this.menu.keySet()) {
            return i;
            //  System.out.println(i);
          }
        return null; 
    }
    public Integer loopingValues(){
        for (Integer i : this.menu.values()) {
                return i;
            // System.out.println(i);
            }
            return null; 
    }
    public static void main(String[] args){
        new Menu().loopingKeys();
        new Menu().loopingValues();
    }
    
}
