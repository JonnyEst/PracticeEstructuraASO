package business.impl;

import business.InterfaceBusiness;
import business.dto.NotasInt;
import business.dto.NotasOut;
import dao.impl.ImplementacionDao;

public class ImplementacionBusiness implements InterfaceBusiness {

    ImplementacionDao implementacionDao = new ImplementacionDao();

    @Override
    public NotasOut saberNota(NotasInt notasInt) {
        NotasOut notasOut = new NotasOut();
        notasOut = implementacionDao.resultMaper(notasInt);
        return notasOut;
    }
}
