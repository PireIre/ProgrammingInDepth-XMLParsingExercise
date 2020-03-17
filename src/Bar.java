import java.util.Comparator;

public class Bar {

    private String SN;
    private Double fett;
    private Double energy;
    private Double kolhydrat;
    private Double protein;
    private Double fiber;


    @Override
    public String toString()
    {
        return "Bar [SN=" + SN + ", fett=" + fett + ", energy=" + energy + ", kolhyrat=" + kolhydrat + ", protein=" + protein + ", fiber=" + fiber + "]";
    }


    public String getSN() {
        return SN;
    }

    public void setSN(String SN) {
        this.SN = SN;
    }

    public Double getFett() {
        return fett;
    }

    public void setFett(double fett) {
        this.fett = fett;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public Double getKolhydrat() {
        return kolhydrat;
    }

    public void setKolhydrat(double kolhydrat) {
        this.kolhydrat = kolhydrat;
    }

    public Double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public Double getFiber() {
        return fiber;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }


}
