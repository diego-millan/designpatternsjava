package patterns;

import org.junit.Assert;
import org.junit.Test;
import patterns.factory.Pessoa;
import patterns.factory.functional.SexoType;

public class FactoryTest {

    @Test
    public void whenInstantiateNewFactoryHomemThenCreateNewObject() {
        Pessoa homem = SexoType.HOMEM.factory.apply("nome");
        Assert.assertEquals(homem.nome, "nome");
    }
}
