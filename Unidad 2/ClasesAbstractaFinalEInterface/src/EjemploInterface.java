public class EjemploInterface implements IOperaciones {

    @Override
    public int grabar() {
        System.out.println("Datos Guardados");
        return 1;
    }

    @Override
    public boolean eliminar() {
        System.out.println("Datos eliminados");
        return true;    
    }

    @Override
    public int modificar() {
        System.out.println("Datos Modificados");
        return 1;    
    }
    
}
