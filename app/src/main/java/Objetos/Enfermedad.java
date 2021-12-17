package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Enfermedad {
    private int id;
    private String[] nombre = {"Brucelosis", "Fiebre Aftosa", "Salmonella", "Rabia"};
    private int[] costo = {75000, 22500,35000,54000};

    public Enfermedad() {
    }

    public Enfermedad(int id, String[] nombre, int[] costo) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public int[] getCosto() {
        return costo;
    }

    public void setCosto(int[] costo) {
        this.costo = costo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Enfermedad)) return false;
        Enfermedad that = (Enfermedad) o;
        return getId() == that.getId() && Arrays.equals(getNombre(), that.getNombre()) && Arrays.equals(getCosto(), that.getCosto());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getId());
        result = 31 * result + Arrays.hashCode(getNombre());
        result = 31 * result + Arrays.hashCode(getCosto());
        return result;
    }

    @Override
    public String toString() {
        return "Enfermedad{" +
                "id=" + id +
                ", nombre=" + Arrays.toString(nombre) +
                ", costo=" + Arrays.toString(costo) +
                '}';
    }
}
