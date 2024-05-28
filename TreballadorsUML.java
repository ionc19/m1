package M5.UF3;

public class  {
    public static void main(String[] args) {
        TreballadorsUML treballador = new TreballadorsUML("Paul", "Catalin", 18, 2500.0, "Vendes");

        System.out.println("Informacio:");
        System.out.println("Nom: " + treballador.nom + " " + treballador.cognoms);
        System.out.println("Edad: " + treballador.obtenirEdat());
        System.out.println("Sou: " + treballador.obtenirSou());
        System.out.println("Departament: " + treballador);

        treballador.canviarDepartament("Recursos Humans");
        System.out.println("Nou departament: " + treballador.departament);
    }
}

public class TreballadorsUML {
    public String nom;
    public String cognoms;
    public int edat;
    public double sou;
    public String departament;

    public TreballadorsUML(String nom, String cognoms, int edat, double sou, String departament) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
        this.sou = sou;
        this.departament = departament;
    }

    public int obtenirEdat() {
        return edat;
    }

    public double obtenirSou() {
        return sou;
    }

    protected void canviarDepartament(String departament) {
        this.departament = departament;
    }

    private double calcularPrimaAntiguitat() {
        return 0;
    }
}
