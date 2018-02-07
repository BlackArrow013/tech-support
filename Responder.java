import java.util.Random;
import java.util.ArrayList;
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
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        coleccion = new ArrayList<String>();
        coleccion.add("Hola");
        coleccion.add("Estamos trabajando en ello");
        coleccion.add("¿En qué puedo ayudarte?");
        coleccion.add("Esperemos que se solucione pronto tu problema");
        coleccion.add("Un placer conocerte. Cuéntame.");        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return coleccion.get(random.nextInt(coleccion.size()));
    }
}
