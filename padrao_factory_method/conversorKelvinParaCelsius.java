package padrao_factory_method;

public class ConversorKelvinParaCelsius implements ConversorTemperatura {
    private float temperatura;

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    private float converterTemperatura() {
        return temperatura - 273.15;
    }
}
