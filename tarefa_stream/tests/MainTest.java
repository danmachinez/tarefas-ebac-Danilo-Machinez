import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

    @Test
    public void testListaNomesFemininos() {
        // Arrange
        List<String> listaNomesGeneros = new ArrayList<>();
        listaNomesGeneros.add("Ana-Feminino");
        listaNomesGeneros.add("Carlos-Masculino");
        listaNomesGeneros.add("Maria-Feminino");
        listaNomesGeneros.add("João-Masculino");

        // Act
        List<String> listaNomesFemininos = listaNomesGeneros.stream()
                .filter(nomeGenero -> nomeGenero.split("-")[1].equalsIgnoreCase("Feminino"))
                .map(nomeGenero -> nomeGenero.split("-")[0])
                .toList();

        // Assert
        Assertions.assertTrue(listaNomesFemininos.contains("Ana"));
        Assertions.assertTrue(listaNomesFemininos.contains("Maria"));
        Assertions.assertFalse(listaNomesFemininos.contains("Carlos"));
        Assertions.assertFalse(listaNomesFemininos.contains("João"));
    }
}
