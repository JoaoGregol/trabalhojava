public class Cilindro {
    double volume;
    double raio;
    double altura;
    double pi = 3.14159265359;

    public double calcularVolume() {
        volume = pi * (raio * raio) * altura;
        return volume;
    }

    public Cilindro(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;

    }
}
