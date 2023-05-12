package com.fays.hello;
import com.sun.jdi.IntegerValue;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@RestController



public class VehiculeController {
    static List<Vehicule> vehicules = new ArrayList<>();

    static {
        Vehicule vehicule1 = new Vehicule("blue", "mercedes", true, 1);
        Vehicule vehicule2 = new Vehicule("purple", "audi", false, 2);

        vehicules.add(vehicule1);
        vehicules.add(vehicule2);

    }

    @RequestMapping(value = "/vehicule")
    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    @RequestMapping(value = "/vehicule/{id}", method = RequestMethod.GET)
    public Vehicule getVehicule(@PathVariable("id") int id) {
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getId() == id) {
                return vehicule;
            }
        }
        return null;
    }

    @RequestMapping(value = "/vehicule/{id}", method = RequestMethod.PUT)
    public Vehicule updateVehicule(@PathVariable("id") Integer id, @RequestBody Vehicule vehicule1) {

        for (Vehicule vehicule : vehicules) {

            if (vehicule.getId() == id) {


                vehicule.setColor(vehicule1.getColor());
                vehicule.setGps(vehicule1.isGps());
                vehicule.setMarque(vehicule1.getMarque());
            }
        }
        return null;
    }

    @RequestMapping(value = "/vehicule/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id) {
        Vehicule vx = null;
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getId() == id) {

                 vx = vehicule;
            }
        }
        vehicules.remove(vx);
    }

    @RequestMapping(value = "/vehicule", method = RequestMethod.POST)
        public void post(@RequestBody Vehicule vehicule) {

        vehicules.add(vehicule);
    }

}