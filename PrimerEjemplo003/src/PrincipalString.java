
public class PrincipalString {
    public static void main(String[] args) {
        String texto = "              HOLA mundo          ";
        String nom2 = "Leo";
        String nom3 = "ana";
        
        System.out.println("Length: " + texto.length());
        
        if(nom2 == "Leo")
            System.out.println("SON iguales");
        else
            System.out.println("NO son iguales");
        
        if(nom2.equals("LEO"))
            System.out.println("SON iguales");
        else
            System.out.println("NO son iguales");
        
        if(nom2.equalsIgnoreCase("LEO"))
            System.out.println("SON iguales ignorando may/min");
        else
            System.out.println("NO son iguales");
        
        System.out.println("trim: " + texto);
        System.out.println("trim: " + texto.trim());
        
        System.out.println("Mayúscula: " + nom2.toUpperCase());
        System.out.println("Minúscula: " + nom2.toLowerCase());
        
        System.out.println("replace : " +texto.
                                        replace("HOLA", "CHAO").
                                        trim() );
        System.out.println("Substring: " + "MARCELA".substring(0,3));
        System.out.println("Substring: " + "MARCELA".substring(3));
        
        
    }
}
