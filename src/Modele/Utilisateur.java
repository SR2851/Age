package Modele;

public class Utilisateur {
private String nom;
private int age;
public Utilisateur(String nom, int age) {
	super();
	this.nom = nom;
	this.age = age;
}
public Utilisateur() {
	super();
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

public boolean estAdulte() {
	
		return (age>=18);
	}
	
}

