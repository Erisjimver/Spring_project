package inversion_of_control;

public class secretarioEmpleado implements Empleados {
    
    private CreacionInformes informeNuevo;
    private String email, nombreEmpresa; 
    
    public void setInformeNuevo(CreacionInformes informeNuevo) {
        this.informeNuevo = informeNuevo;
    } 

    @Override
    public String getTareas() {
       return "Gestiono las cuestiones relativas al jefe";
    }

    @Override
    public String getInformes() {
        return "Informe generado por el director: " +informeNuevo.getInformes();
    }  
    
    //setters and getters email y nombre empresa
    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    //terminan lso setters and getters    
}