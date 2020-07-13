package patterns.factory.functional;

import patterns.factory.Homem;
import patterns.factory.Mulher;
import patterns.factory.Pessoa;

import java.util.function.Function;

public enum SexoType {
    HOMEM(Homem::new),
    MULHER(Mulher::new);

    public final Function<String, Pessoa>  factory;
    SexoType (Function<String, Pessoa>  factory) {
        this.factory = factory;
    }
}
