public class Cone {
    double volume;
    double altura;
    double raio;
    double pi = 3.14159265359;

    double calculaVolume() {
        volume = (pi * (raio * raio) * altura) / 3;
        return volume;
    }

    public Cone(double altura, double raio) {
        this.altura = altura;
        this.raio = raio;
    }

}
