import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by josecopovi-king on 10/01/2017.
 */
public class HashMapDemo {

    public static void main (String args[]) {

        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        Set set = hm.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        //Deposit 1000 into Zara's account
        double balance = hm.get("Zara");
        hm.put("Zara", balance + 1000);
        System.out.println("Zara's new balance: " + hm.get("Zara"));
    }


}
