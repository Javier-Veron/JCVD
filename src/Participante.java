public class Participante{

    String nombre ;
    double fuerza ;
    int energia,constanteJVCD = 4 ,valorDeterminado = 500;

    public void detalle(){

        System.out.println("Nombre: " + nombre);
        System.out.println("Fuerza: " + fuerza);
        System.out.println("Energia: " + energia);
    }
    //

    public boolean tieneFuerza(){
        if (valorDeterminado < (fuerza*constanteJVCD)) {
            return true;
        }
        else return false;

    }

    public boolean tieneEnergia(){
        if (energia > 15) {
            return true;
        }
        else return false;

    }

    public boolean esChuckNorris(){
        if (tieneFuerza() && tieneEnergia()) {
            return true;
        }
        else return false;
    }

    public boolean esInsecto(){

        return fuerza < 500;
    }

    public void entrenar(int horas){
        fuerza += (0.5 * horas);
        energia -= 20;
    }

    public void dormir(){

        energia += 20;

    }

}
