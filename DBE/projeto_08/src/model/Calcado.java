package model;

public class Calcado extends Produto{

    private String materialSola;
    private String materialParteSuperior;
    private String materialInterno;

    public Calcado(int c, String d, double v, String n, String co, String t, String ms, String mps, String mi) {
        super(c, d, v);
        this.setMaterialSola(ms);
        this.setMaterialParteSuperior(mps);
        this.setMaterialInterno(mi);
    }

    public String getMaterialSola() {
        return materialSola;
    }

    public void setMaterialSola(String argMS) {
        if (argMS.length() > 1 && argMS.length() < 10) {
            this.materialSola = argMS;
        } else {
            System.out.println("Material da Sola Inválido");
        }
    }

    public String getMaterialParteSuperior() {
        return materialParteSuperior;
    }

    public void setMaterialParteSuperior(String argMPS) {
        if (argMPS.length() > 1 && argMPS.length() < 10) {
            this.materialParteSuperior = argMPS;
        } else {
            System.out.println("Material da Parte Superior Inválido");
        }
    }

    public String getMaterialInterno() {
        return materialInterno;
    }

    public void setMaterialInterno(String argMI) {
        if (argMI.length() > 1 && argMI.length() < 10) {
            this.materialInterno = argMI;
        } else {
            System.out.println("Material interno Inválido");
        }
    }

    public String print() {
        String ret;
        ret = super.print();
        ret = ret + "\nMaterial da Sola: " + this.materialSola +
                "\nMaterial Parte Superior: " + this.materialParteSuperior +
                "\nMaterial Interno: " + this.materialInterno;
        return ret;
    }
}
