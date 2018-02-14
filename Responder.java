import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private ArrayList<String> coleccion;
    private HashMap<HashSet<String>, String> respuesta;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        coleccion = new ArrayList<String>();
        respuesta = new HashMap<>();
        coleccion.add("Hola");
        coleccion.add("Estamos trabajando en ello");
        coleccion.add("¿En qué puedo ayudarte?");
        coleccion.add("Esperemos que se solucione pronto tu problema");
        coleccion.add("Un placer conocerte. Cuéntame."); 

        HashSet<String> opcion1 = new HashSet<String>();
        opcion1.add("virus");
        opcion1.add("programa");
        HashSet<String> opcion2 = new HashSet<String>();  
        opcion2.add("lento");
        HashSet<String> opcion3 = new HashSet<String>(); 
        opcion3.add("harto");
        opcion3.add("inutil");
        opcion3.add("programa");
        
        respuesta.put(opcion1, "Eso es imposible, nuestro programa no contiene ningún virus.");
        respuesta.put(opcion2, "No trabaje con nuestro programa si tiene otros abiertos.");
        respuesta.put(opcion3, "Cálmese, la ira no es la solución.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet<String> word)
    {
        String response = null;
        
        response = respuesta.get(word);
        
        if (response == null) {
            if (coleccion.size() > 0) {
                response = coleccion.get(random.nextInt(coleccion.size()));
                coleccion.remove(response);
            }
            else {
                response = "No te entiendo, lo siento.";
            }
        }
        return response;
    }
}
