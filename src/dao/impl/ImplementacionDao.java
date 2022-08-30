package dao.impl;

import business.dto.NotasInt;
import business.dto.NotasOut;
import dao.InterfaceDao;
import dao.mapper.ImplementsDaoMapper;

public class ImplementacionDao implements InterfaceDao {

    ImplementsDaoMapper implementsDaoMapper = new ImplementsDaoMapper();


    @Override
    public NotasOut resultMaper(NotasInt notasInt) {
        int resultado =(notasInt.getNum1()+notasInt.getNum2()+ notasInt.getNum3()+ notasInt.getNum4()+ notasInt.getNum5()/5);
        NotasOut notasOut = implementsDaoMapper.ResultadoMapper(resultado);
        return notasOut;
    }
}
