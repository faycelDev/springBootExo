package com.fays.hello;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PersonneController {

        static List<Personne> personnes = new ArrayList<>();

        static {
                Personne personne = new Personne("fays", 28, "benali", 170, 1);
                Personne personne2 = new Personne("louis", 38, "jean", 180, 2);
                personnes.add(personne);
                personnes.add(personne2);


        }

        @RequestMapping(value = "/personne")
        public List<Personne> getPersonnes() {
                return personnes;
        }

        @RequestMapping(value = "/personne/{id}", method = RequestMethod.GET)
        public Personne getPersonne(@PathVariable("id") String id) {
                for (Personne personne : personnes) {
                        if (personne.getId() == Integer.valueOf(id)) {
                                return personne;
                        }

                }
                return null;
        }

        @RequestMapping(value = "/personne/{id}", method = RequestMethod.DELETE)

        public void delete(@PathVariable("id") String id) {
                Personne px = null;
                for (Personne personne : personnes) {
                        if (personne.getId() == Integer.valueOf(id)) {
                             px = personne;
                        }

                }
                personnes.remove(px);
        }

        @RequestMapping(value = "/personne/{id}", method = RequestMethod.PUT)
        public void updatePersonne(@PathVariable("id") String id, @RequestBody Personne personne2) {
                for (Personne personne : personnes) {
                        if (personne.getId() == Integer.valueOf(id)) {

                                personne.setAge(personne2.getAge());
                                personne.setNom(personne2.getNom());
                                personne.setPrenom(personne2.getPrenom());
                                personne.setTaille(personne2.getTaille());
                        }

                }

        }

                @RequestMapping(value = "/personne", method = RequestMethod.POST)
                public void post(@RequestBody Personne personne){

                                personnes.add(personne);




        }
}