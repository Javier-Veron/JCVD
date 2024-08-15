public class Main {
    public static void main(String[] args) {
        Participante contrincante1 = new Participante();
        contrincante1.nombre = "Javier";
        contrincante1.fuerza = 35.0;
        contrincante1.energia = -10;

        Participante contrincante2 = new Participante();
        contrincante2.nombre = "Leo";
        contrincante2.fuerza = 1.0;
        contrincante2.energia = 100;

        Participante contrincante3 = new Participante();
        contrincante3.nombre = "Tomas";
        contrincante3.fuerza = 6.66;
        contrincante3.energia = 10;

        contrincante1.detalle();
        System.out.println();
        contrincante2.detalle();
        System.out.println();
        contrincante3.detalle();
        System.out.println();

        contrincante1.dormir();
        contrincante1.dormir();
        contrincante1.entrenar(4);
        contrincante1.dormir();
        contrincante1.entrenar(3);
        contrincante1.dormir();
        System.out.println("El contrincante "+contrincante1.nombre+" es ChuckNorris? "  + contrincante1.esChuckNorris());
        System.out.println("El contrincante "+contrincante1.nombre+" es Insecto? "  + contrincante1.esInsecto());

        contrincante2.entrenar(1);
        contrincante2.dormir();
        contrincante2.entrenar(3);
        contrincante2.dormir();
        contrincante2.entrenar(5);
        contrincante2.dormir();
        contrincante2.dormir();
        contrincante2.dormir();

        System.out.println("El contrincante "+contrincante2.nombre+" es ChuckNorris? "  + contrincante2.esChuckNorris());
        System.out.println("El contrincante "+contrincante2.nombre+" es Insecto? "  + contrincante2.esInsecto());

        contrincante3.entrenar(10);
        contrincante3.dormir();
        contrincante3.entrenar(0);
        contrincante3.dormir();
        contrincante3.entrenar(0);
        contrincante3.dormir();
        contrincante3.dormir();

        System.out.println("El contrincante "+contrincante3.nombre+" es ChuckNorris? "  + contrincante3.esChuckNorris());
        System.out.println("El contrincante "+contrincante3.nombre+" es Insecto? "  + contrincante3.esInsecto());

        System.out.println();
        contrincante1.detalle();
        System.out.println();
        contrincante2.detalle();
        System.out.println();
        contrincante3.detalle();
    }
}