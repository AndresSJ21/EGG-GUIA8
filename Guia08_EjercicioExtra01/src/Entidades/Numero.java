package Entidades;

public class Numero {
//atributos

    private int valor;
//constructores

    public Numero() {

    }

    public Numero(int valor) {
        this.valor = valor;
    }
//getters and setters

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
//equals and hashCodes

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.valor;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Numero other = (Numero) obj;
        if (this.valor != other.valor) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return " " + valor;
    }

}
