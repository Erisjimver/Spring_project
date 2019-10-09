package inversion_of_control;


public class jefeEmpleado implements Empleados{
    
    private CreacionInformes informeNuevo;
    
    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    }
        
    @Override
    public String getTareas() {
       return "Gestiono las cuestiones relativas al jefe";
    }

    @Override
    public String getInformes() {
        return "Informe generado por el jefe: " +informeNuevo.getInformes();
    }   
    
}
