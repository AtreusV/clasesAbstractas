public class circulos extends Figura{

    public float radio;

    @Override
    public float area() {
        return 3.1415f * (radio*radio);
    }
}
