import java.util.HashMap;

public class transacties {

    HashMap<String,Double> tranacties = new HashMap<>();
    //transacties
    public transacties(){
        tranacties.put("T-Shirt", 12.99);
        tranacties.put("Jeans", 24.99);
        tranacties.put("Sneakers", 49.99);
        tranacties.put("Hamburger", 3.99);
        tranacties.put("Pizza", 8.99);
        tranacties.put("Sushi Roll", 11.99);
        tranacties.put("Gold Necklace", 21.99);
        tranacties.put("Diamond Earrings", 25.99);
        tranacties.put("Leather Watch", 6.99);
    }

    public void SetTransacties(String s, Double d){
        tranacties.put(s,d);
    }

    public HashMap<String,Double> getTranacties (){
           return tranacties;
    }


}
