package inversion_of_control;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {


    public static void main(String[] args) {
        // Cargando XML de configuracion
        ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
        
        //peticion de beans al contenedor Spring
        Empleados Israel=contexto.getBean("secretarioEmpleado",Empleados.class);
        Empleados Jimena=contexto.getBean("secretarioEmpleado",Empleados.class);
        System.out.println(Israel);
        System.out.println(Jimena);     
        contexto.close();
    }
    
}
