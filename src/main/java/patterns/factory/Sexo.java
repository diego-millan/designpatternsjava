package patterns.factory;

public enum Sexo {
    HOMEM("H"),
    MULHER("M");

    private final String sigla;

    Sexo(String sigla) {
        this.sigla = sigla;
    }
}
