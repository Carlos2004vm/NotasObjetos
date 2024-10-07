package clasesobjetos;

public class Estudiante {
    String nombre;
    Float notaparcial, notaparcial2, notafinal1;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, Float np1, Float np2) {
        this.nombre = nombre;
        this.notaparcial = np1;
        this.notaparcial2 = np2;
    }

        public  void asignarNotaparcial1(float np1) {
            this.notaparcial = np1;
        }
        public void asignarNotaparcial2(float np2) {
            this.notaparcial = np2;
        }
        public float obtenerNotaparcial1() {
            return notaparcial2;
        }
        public float obtenerNotaparcial2(){
            return notaparcial;
        }


    public void calcularNotaFinal(){
        notafinal1 = (notaparcial + notaparcial2) /2;
    }
    public float obtenerNotafinal(){
        return notafinal1;
    }
    public String obtenerMensaje(){
        if (notafinal1 <= 3) {
            return "reprobo";
        }else {
            return "aprobo";
        }
    }


}
