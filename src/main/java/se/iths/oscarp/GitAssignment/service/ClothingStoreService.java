package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.GitAssignment.model.ClothingStore;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClothingStoreService {

    public List<ClothingStore> getClothing() {
        ArrayList<ClothingStore> clothingStoreArrayList = new ArrayList<>();
        ClothingStore tshirt = new ClothingStore(1, "T-shirt", 300);
        ClothingStore hoodie = new ClothingStore(2, "Hoodie", 549.90);
        ClothingStore jeans = new ClothingStore(3, "Jeans", 799);
        clothingStoreArrayList.add(tshirt);
        clothingStoreArrayList.add(hoodie);
        clothingStoreArrayList.add(jeans);
        return clothingStoreArrayList;
    }
}
