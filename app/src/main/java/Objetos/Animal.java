package Objetos;

import java.util.Arrays;
import java.util.Objects;

public class Animal {
    private int id;
    private String[] nombre = {"Animal Domestico", "Animal Salvaje", "Otros"};
    private int[] costo = {25000,45000,18000};

    public Animal() {
    }

    public Animal(int id, String[] nombre, int[] costo) {
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
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getId() == animal.getId() && Arrays.equals(getNombre(), animal.getNombre()) && Arrays.equals(getCosto(), animal.getCosto());
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
        return "Animal{" +
                "id=" + id +
                ", nombre=" + Arrays.toString(nombre) +
                ", costo=" + Arrays.toString(costo) +
                '}';
    }

    //OPERACIONES PARA SPINNERS
    public int cal1(){
        int resultado;
        return resultado = 25000+75000;
    }
    public int cal2(){
        int resultado;
        return resultado = 25000+22500;
    }
    public int cal3(){
        int resultado;
        return resultado = 25000+35000;
    }
    public int cal4(){
        int resultado;
        return resultado = 25000+54000;
    }
    public int cal5(){
        int resultado;
        return resultado = 45000+75000;
    }
    public int cal6(){
        int resultado;
        return resultado = 45000+22500;
    }
    public int cal7(){
        int resultado;
        return resultado = 45000+35000;
    }
    public int cal8(){
        int resultado;
        return resultado = 45000+54000;
    }
    public int cal9(){
        int resultado;
        return resultado = 18000+75000;
    }
    public int cal10(){
        int resultado;
        return resultado = 18000+22500;
    }
    public int cal11(){
        int resultado;
        return resultado = 18000+35000;
    }

    public int cal12(){
        int resultado;
        return resultado = 18000+54000;
    }
}
