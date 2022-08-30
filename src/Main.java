import facade.InterfaceFacade;
import facade.dto.NotasEntrada;
import facade.impl.ImplementacionFacade;

public class Main {

    public static void main(String[] args) {
        ImplementacionFacade implementacionFacade = new ImplementacionFacade();
        int result = implementacionFacade.SaberNota(mapeoEntrada());
        System.out.println("Su nota es: "+result);
    }

    public static NotasEntrada mapeoEntrada (){
        NotasEntrada notasEntrada = new NotasEntrada();
        notasEntrada.setNum1(4);
        notasEntrada.setNum2(2);
        notasEntrada.setNum3(5);
        notasEntrada.setNum4(3);
        notasEntrada.setNum5(2);

        return notasEntrada;
    }
}
