import facade.InterfaceFacade;
import facade.impl.ImplementacionFacade;

public class Main {

    public static void main(String[] args) {
        ImplementacionFacade implementacionFacade = new ImplementacionFacade();
        int result = implementacionFacade.SaberNota(4,2,3,5,2);
        System.out.println("Su nota es: "+result);
    }
}
