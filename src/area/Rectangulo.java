package area;

public class Rectangulo {

    private int altura, base, area;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    public void CalcularArea() {
        area = base * altura;
    }

    public void Imprimir() {
        CalcularArea();
        System.out.print("El área del Rectangulo es = " + area);
    }
}
