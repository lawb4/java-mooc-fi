package Fundamentals_II.Part_8.HashMap.IOweYou;

import java.util.HashMap;

public class IOU {

    private HashMap<String, Double> map;

    public IOU() {
        this.map = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        /*for (String person : map.keySet()) {
            if (person.equals(toWhom)) {
                return map.get(person);
            }
        }
        return 0;*/
        return map.getOrDefault(toWhom, 0d);
        // If there is no such person, return 0 owed money.
    }
}
