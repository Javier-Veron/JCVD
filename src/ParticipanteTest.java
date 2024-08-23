import static org.junit.jupiter.api.Assertions.*;

class ParticipanteTest {

    //TEST TIENE FUERZA
    @org.junit.jupiter.api.Test
    void tieneFuerzaTrue(){
        Participante unP = new Participante();
        unP.fuerza = 126;
        assertTrue((unP.fuerza* unP.constanteJVCD) > 500);

    }

    @org.junit.jupiter.api.Test
    void tieneFuerzaFalse(){
        Participante unP = new Participante();
        unP.fuerza = 125;
        assertFalse((unP.fuerza* unP.constanteJVCD) > 500);
    }

    //TEST TIENE ENERGIA
    @org.junit.jupiter.api.Test
    void tieneEnergiaTrue(){
        Participante unP = new Participante();
        unP.energia = 16;
        assertTrue(unP.energia > 15);
    }

    @org.junit.jupiter.api.Test
    void tieneEnergiaFalse(){
        Participante unP = new Participante();
        unP.fuerza = 15;
        assertFalse(unP.energia > 15);
    }

    //TEST ES CHUCKNORRIS

    @org.junit.jupiter.api.Test
    void tieneFuerzaTrueEnergiaTrue() {
        Participante unP = new Participante();
        unP.fuerza = 126;
        unP.energia = 20;
        assertTrue(unP.tieneFuerza()) ;
        assertTrue(unP.tieneEnergia()) ;
    }

    @org.junit.jupiter.api.Test
    void tieneFuerzaTrueEnergiaFalse() {
        Participante unP = new Participante();
        unP.fuerza = 126;
        unP.energia = 15;
        assertTrue(unP.tieneFuerza()) ;
        assertFalse(unP.tieneEnergia()) ;
    }

    @org.junit.jupiter.api.Test
    void tieneFuerzaFalseEnergiaTrue() {
        Participante unP = new Participante();
        unP.fuerza = 125;
        unP.energia = 20;
        assertFalse(unP.tieneFuerza()) ;
        assertTrue(unP.tieneEnergia()) ;
    }
    @org.junit.jupiter.api.Test
    void tieneFuerzaFalseEnergiaFalse() {
        Participante unP = new Participante();
        unP.fuerza = 125;
        unP.energia = 15;
        assertFalse(unP.tieneFuerza()) ;
        assertFalse(unP.tieneEnergia()) ;
    }

    //TEST ES INSECTO

    @org.junit.jupiter.api.Test
    void esInsectoTrue() {
        Participante unP = new Participante();
        unP.fuerza = 501;
        assertTrue(unP.fuerza>500);
    }

    @org.junit.jupiter.api.Test
    void esInsectoFalse() {
        Participante unP = new Participante();
        unP.fuerza = 500;
        assertFalse(unP.fuerza>500);
    }


    //TEST ENTRENAR

    @org.junit.jupiter.api.Test
    void entrenarTrue() {
        int horas,energiaOld;
        double fuerzaOld;
        horas = 1;
        Participante unP = new Participante();
        unP.fuerza = 500;
        unP.energia = 20;
        fuerzaOld = unP.fuerza;
        energiaOld = unP.energia;
        unP.entrenar(horas);
        assertTrue((unP.fuerza > fuerzaOld) && (unP.energia < energiaOld));

    }

    @org.junit.jupiter.api.Test
    void entrenarFalse() {
        int horas,energiaOld;
        double fuerzaOld;
        horas = 0;
        Participante unP = new Participante();
        unP.fuerza = 500;
        unP.energia = 20;
        fuerzaOld = unP.fuerza;
        energiaOld = unP.energia;
        unP.entrenar(horas);
        assertFalse((unP.fuerza > fuerzaOld) && (unP.energia < energiaOld));
    }

    //TEST DORMIR

    @org.junit.jupiter.api.Test
    void dormir() {
        int energiaOld;
        Participante unP = new Participante();
        unP.energia = 0;
        energiaOld = unP.energia;
        unP.dormir();
        assertEquals(20,unP.energia-energiaOld);
    }

}