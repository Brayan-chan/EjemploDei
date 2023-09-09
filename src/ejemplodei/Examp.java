package ejemplodei;

class Examp {
    //Atributos
    String nombre, carrera;
    int matricula, grado;
    char grupo;
    
    //Constructores
    public Examp() {
        
    }
     public Examp(String nombre, String carrera, int matricula, int grado, char grupo) {
        this.nombre = nombre;
        setCarrera(carrera);
        this.matricula = matricula;
        this.grado = grado;
        this.grupo = grupo;
    }
    
    //Metodos
    public String getNombre() { return nombre; }

    public String getCarrera() { return carrera; }

    public int getGrado() { return grado; }

    public char getGrupo() { return grupo; }

    public int getMatricula() { return matricula; }
    
    public void setCarrera(String carrera) {
        carrera = carrera.toUpperCase();
        
        switch (carrera) {
            case "ISC":
              this.carrera = "Ingeniero en Sistemas Computacionales";
              break;
              
            case "ICA":
              this.carrera = "Ingenieria Civil y Administracion";
              break;
              
            case "ITS":
              this.carrera = "Ingenieria en Tecnologia y Software";
              break;
              
            case "IIN":
              this.carrera = "Ingenieria Informatica";
              break;
             
            case "IM":
              this.carrera = "Ingenieria Mecanica";
              break;
              
            default:
              this.carrera = "Ingeniero";
              
        }
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", carrera=" + carrera + ", matricula=" + matricula + ", grado=" + grado + ", grupo=" + grupo +'}';
    }
}
