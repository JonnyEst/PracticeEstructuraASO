package facade.impl;

import business.dto.NotasInt;
import business.dto.NotasOut;
import business.impl.ImplementacionBusiness;
import facade.InterfaceFacade;
import facade.dto.NotasEntrada;
import facade.mapper.impl.ImplementacionFacadeMapper;

public class ImplementacionFacade implements InterfaceFacade {

    ImplementacionFacadeMapper implementacionFacadeMapper = new ImplementacionFacadeMapper();
    ImplementacionBusiness implementacionBusiness = new ImplementacionBusiness();
    @Override
    public int SaberNota(NotasEntrada notasEntrada) {

        NotasInt notasInt = implementacionFacadeMapper.MapeoEntrada(notasEntrada);
        NotasOut notasOut = implementacionBusiness.saberNota();
        return 0;
    }
}
