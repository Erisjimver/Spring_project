package inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class usoEmpleados {


    public static void main(String[] args) {
        
        

        //Creacion de objetos de tipo empleado
       /* 
        Empleados Empleado1=new jefeEmpleado();
        Empleados Empleado2=new secretarioEmpleado();
        Empleados Empleado3=new directorEmpleado();
        
        System.out.println(Empleado1.getTareas());
        System.out.println(Empleado2.getTareas());
        System.out.println(Empleado3.getTareas());
               
        //uso de lso objetos creados
        Empleados Israel=contexto.getBean("secretarioEmpleado",Empleados.class);
        System.out.println(Israel.getTareas());
        System.out.println(Israel.getInformes());

       
        
        
        Empleados Maria=contexto.getBean("directorEmpleado",Empleados.class);
        System.out.println("Tareas del director: "+Maria.getTareas());
        System.out.println("Informes del director: "+Maria.getInformes());
        System.out.println("El correo es: "+Israel.getEmail());
        System.out.println("El nombre de la empresa es: "+Israel.getNombreEmpresa());
        
        contexto.close();
       */





        ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
        
        //peticion de beans al contenedor Spring
        Empleados Israel=contexto.getBean("secretarioEmpleado",Empleados.class);
        Empleados Jimena=contexto.getBean("secretarioEmpleado",Empleados.class);
        Empleados Manolo=contexto.getBean("secretarioEmpleado",Empleados.class);
        Empleados Juanco=contexto.getBean("secretarioEmpleado",Empleados.class);
        Empleados Solang=contexto.getBean("secretarioEmpleado",Empleados.class);
        Empleados Maria=contexto.getBean("secretarioEmpleado",Empleados.class);
        System.out.println(Israel);
        System.out.println(Jimena);
        System.out.println(Manolo);
        System.out.println(Juanco);
        System.out.println(Solang);
        
        
        
        System.out.println("Tareas del director: "+Maria.getTareas());
        System.out.println("Informes del director: "+Maria.getInformes());
        System.out.println("El correo es: "+Maria.getEmail());
        System.out.println("El nombre de la empresa es: "+Maria.getNombreEmpresa());
        
        
        if(Israel==Jimena){
            System.out.println("Apuntan al mismo objeto");
        }
        else{
            System.out.println("No se trata del mismo objeto");
        }
        contexto.close();


        
    }
    
}
