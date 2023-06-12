package Fundamentals_II.Part_8.SimilarityOfObjects.StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());

        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String unitSearch) {
        for (String unit : storage.keySet()) {
            if (!(storage.get(unitSearch).isEmpty())) {
                return storage.get(unitSearch);
            }
        }
        return new ArrayList<>();
        //return storage.getOrDefault(unitSearch, new ArrayList<>());
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for (String unit : storage.keySet()) {
            if (!(storage.get(unit).isEmpty())) {
                units.add(unit);
            }
        }
        return units;
    }

    public void remove(String storageUnit, String item){
        /*if (!this.storage.containsKey(storageUnit)) {
            return;
        }*/

        storage.get(storageUnit).remove(item);

        if (storage.get(storageUnit).isEmpty()){
            storage.remove(storageUnit);
        }
    }
}

