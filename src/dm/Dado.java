package dm;

/**
 *
 * @author Rafael
 */
public class Dado {
    
    private int dado;
    
    public int jogarDado(int d){
        
        dado = (int) (Math.random() * d) + 1;
        
        return dado;
    }
}
