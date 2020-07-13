package patterns.factory;

public class FactoryPessoa {
    public Pessoa getPessoa(String nome, Sexo sexo) {
        if (sexo.equals("M"))
            return new Homem(nome);
        if (sexo.equals("F"))
            return new Mulher(nome);
        else
            throw new ClassCastException();
    }
}
