public class Cubo {
    double volume;
    double areaBase;

    double calculaVolume() {
        volume = (areaBase * areaBase * areaBase);
        return volume;
    }

    public Cubo(double areaBase) {
        this.areaBase = areaBase;
    }
}
