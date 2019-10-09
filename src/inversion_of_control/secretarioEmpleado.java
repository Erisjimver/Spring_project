package inversion_of_control;


public class secretarioEmpleado implements Empleados {
    //creacion de campo tipo CreacionInformes(interfaz)
    private CreacionInformes informeNuevo;
    
    //creacion de constructor que inyecta la dependencia
    public secretarioEmpleado(CreacionInformes informeNuevo){
        this.informeNuevo=informeNuevo;
    }
    @Override
    public String getTareas() {
        return "Gestionar la agenda de los jefes"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getInformes() {
        return "informe creado por la secretaria: " +informeNuevo.getInformes();
    }
    
}
