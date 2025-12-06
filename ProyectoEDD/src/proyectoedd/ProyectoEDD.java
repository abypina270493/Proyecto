package proyectoedd;

/**
 *
 * @author apina
 */
public class ProyectoEDD {

    public static void main(String[] args) {
    try {
            MyStack<String> acciones = new MyStack<>();

            // Simulando acciones del usuario
            acciones.push("Escribio una frase");
            acciones.push("Inserto una imagen");
            acciones.push("Borro un parrafo");

            System.out.println("Historial actual: " + acciones);

            // Deshacer acción
            String ultimaAccion = acciones.pop();
            System.out.println("Se deshizo la accion: " + ultimaAccion);

            System.out.println("Historial despues de deshacer: " + acciones);

            // Última acción disponible
            System.out.println("Ultima accion pendiente: " + acciones.peek());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
        
    }
    
}
