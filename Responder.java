import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    private ArrayList<String> coleccion;
    private HashMap<String, String> respuesta;
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
        coleccion.add("�En qu� puedo ayudarte?");
        coleccion.add("Esperemos que se solucione pronto tu problema");
        coleccion.add("Un placer conocerte. Cu�ntame."); 

        respuesta.put("lento", "Aseg�rese de no abrir demasiados programas al mismo tiempo.");
        respuesta.put("problema", "�Podr�a indicarnos qu� tipo de problema tiene?");
        respuesta.put("caro", "Lo sentimos, pero el precio no variar�.");
        respuesta.put("virus", "Si su ordenador contiene un virus, pruebe a pasarle el Avast o cualquier otro antivirus. Esa puede ser la soluci�n.");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String response = null;
        response = respuesta.get(word);
        if (response == null) {
            response = coleccion.get(random.nextInt(coleccion.size()));           
        }
        return response;
    }
}
