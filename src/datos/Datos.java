/*
Nombre
Carrera
Materia
El repositorio con nombre "POO"
*/

package datos;

/**
 *
 * @author invitado
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--->DATOS GENERALES<---");
        DatosG info = new DatosG (19,"ISC","POO","21550296");
        String NumCon = info.getEdad()+" "+info.getCarrera()+" "+info.getMateria()+" "+info.getNumControl()+" ";
        
    }
    
}
