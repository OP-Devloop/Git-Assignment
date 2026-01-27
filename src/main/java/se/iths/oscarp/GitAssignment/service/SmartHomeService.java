package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.GitAssignment.model.SmartHome;

import java.util.ArrayList;
import java.util.List;

@Service
public class SmartHomeService {

    public List<SmartHome> SmartHomeList() {

        List<SmartHome> smarthome = new ArrayList<>();

        SmartHome smarthome1 = new SmartHome(1, "Smart LED Light Bulb", "App-controlled bulb with color and brightness settings.", 19.99);
        SmartHome smarthome2 = new SmartHome(2, "Smart Plug", "Wi-Fi enabled plug for remote control of devices.", 17.99);
        SmartHome smarthome3 = new SmartHome(3, "Smartwatch", "Fitness-tracking watch with heart-rate monitor.", 149.99);
        SmartHome smarthome4 = new SmartHome(4, "Home Security Camera", "Indoor camera with motion detection and night vision.", 79.99);
        SmartHome smarthome5 = new SmartHome(5, "Digital Alarm Clock", "LED alarm clock with temperature display and USB charging.", 16.99);

        smarthome.add(smarthome1);
        smarthome.add(smarthome2);
        smarthome.add(smarthome3);
        smarthome.add(smarthome4);
        smarthome.add(smarthome5);

        return smarthome;
    }
}
