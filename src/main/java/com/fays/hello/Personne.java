package com.fays.hello;

public class Personne {

    public String nom;
    public int age;
    public String prenom;
    public int taille;
    public int id;

    public Personne(String nom, int age, String prenom, int taille, int id)
    {
        this.nom = nom;
        this.age = age;
        this.prenom = prenom;
        this.taille = taille;
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
}
