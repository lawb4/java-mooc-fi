package Fundamentals_II.Part_8.SimilarityOfObjects.VehicleRegistry;

import java.util.ArrayList;
import java.util.HashMap;

//????????????????????????????

public class VehicleRegistry {

    private HashMap<LicensePlate, String> plates;

    public VehicleRegistry() {
        this.plates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        plates.put(licensePlate, owner);
        return !plates.containsValue(owner);
        //?????????????????????????????????????????????

    }

    public String get(LicensePlate licensePlate) {
        return plates.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (plates.containsKey(licensePlate)) {
            plates.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : plates.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : plates.values()) {
            //System.out.println(owner);
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
