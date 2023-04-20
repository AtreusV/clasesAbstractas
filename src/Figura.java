import javax.swing.plaf.basic.BasicBorders;

public abstract class Figura {
    public int numeroLados;
    public float radio;

    public Figura() {
        this.numeroLados = 4;
        this.radio = 2f;
    }


    //al ser abstract deja de ser metodo convencional
    public abstract float area();

}
