package bo.ucb.tdd.Taller5;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class PersonaTest {

    /***
     * Al crear una persona, esta será situada en un piso aleatorio entre 1 y 3
     */
    @Test
    public void crearPersonaEnPisoAleatorio(){
        System.out.println();
        System.out.println("======================================");
        System.out.println("Testing crearPersonaEnPisoAleatorio...");
        System.out.println();

        // 1. Preparacion de la prueba
        Persona p;

        for(int i = 0; i<5; i++){
            // 2. Logica de la prueba
            p = new Persona();

            // 3. Verificacion (Assert)
            System.out.println(p.getPiso());
            assertTrue(p.getPiso() < 4 && p.getPiso() > 0);
        }

        System.out.println("======================================");
    }

    /***
     * El metodo .setDestino() creara numeros aleatorios hasta que sean diferentes
     * del piso actual
     */
    @Test
    public void obtenerPisoDeDestinoDePersona(){
        System.out.println();
        System.out.println("======================================");
        System.out.println("Testing obtenerPisoDeDestinoDePersona...");
        System.out.println();

        // 1. Preparacion de la prueba
        Persona p;

        // 2. Logica de la prueba
        p = new Persona();
        p.setDestino();

        // 3. Verificacion (Assert)
        System.out.println("Piso actual: " + p.getPiso());
        System.out.println("Destino: " + p.getDestino());
        assertTrue(p.getPiso() < 4 && p.getPiso() > 0);
        assertNotEquals(p.getPiso(), p.getDestino());

        System.out.println("======================================");
    }
}
