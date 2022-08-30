package facade.mapper.impl;

import business.dto.NotasInt;
import business.dto.NotasOut;
import facade.dto.NotasEntrada;
import facade.dto.NotasSalida;
import facade.mapper.InterfaceFacadeMapper;

public class ImplementacionFacadeMapper implements InterfaceFacadeMapper {


    @Override
    public NotasInt MapeoEntrada(NotasEntrada notasEntrada) {
        NotasInt notasInt = new NotasInt();
        notasInt.setNum1(notasEntrada.getNum1());
        notasInt.setNum2(notasEntrada.getNum2());
        notasInt.setNum3(notasEntrada.getNum3());
        notasInt.setNum4(notasEntrada.getNum4());
        notasInt.setNum5(notasEntrada.getNum5());
        return notasInt;
    }

    @Override
    public NotasSalida MapeoSalida(NotasOut notasOut) {
        NotasSalida notasSalida = new NotasSalida();
        notasSalida.setResultado(notasOut.getResultado());
        return notasSalida;
    }
}
