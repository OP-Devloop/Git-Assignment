package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.GitAssignment.model.Accessories;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccessoriesService {

    public List<Accessories> AccessoriesList() {
        List<Accessories> accessories = new ArrayList<>();

        Accessories accessory1 = new Accessories(1, "Wireless Earbuds", "Bluetooth earbuds with charging case and touch controls.", 49.99);
        Accessories accessory2 = new Accessories(2, "Bluetooth Speaker", "Portable speaker with deep bass and long battery life.", 42.99);
        Accessories accessory3 = new Accessories(3, "Wireless Mouse", "Ergonomic mouse with adjustable DPI.", 24.99);
        Accessories accessory4 = new Accessories(4, "USB-C Hub", "Multi-port adapter with HDMI and USB connections.", 39.99);
        Accessories accessory5 = new Accessories(5, "Wireless Charging Pad", "Fast charging pad for compatible smartphones.", 29.99);

        accessories.add(accessory1);
        accessories.add(accessory2);
        accessories.add(accessory3);
        accessories.add(accessory4);
        accessories.add(accessory5);

        return accessories;
    }
}
