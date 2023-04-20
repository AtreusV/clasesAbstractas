public class cuadrado extends Figura{
    protected int numeroLados;

    @Override
    public float area() {
        return numeroLados * numeroLados;
    }
}
