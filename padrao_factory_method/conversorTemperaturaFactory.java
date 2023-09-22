package padrao_factory_method;

public class ConversorTemperaturaFactory {

    public static ConversorTemperatura selecionarConversor(String conversor) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("padrao_factory_method.conversor" + conversor);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Conversor inexistente");
        }
        if (!(objeto instanceof ConversorTemperatura)) {
            throw new IllegalArgumentException("Conversor inválido");
        }
        return (ConversorTemperatura) objeto;
    }
}
