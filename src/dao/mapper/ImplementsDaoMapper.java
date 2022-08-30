package dao.mapper;

import business.dto.NotasOut;

public class ImplementsDaoMapper implements InterfaceDaoMapper{
    @Override
    public NotasOut ResultadoMapper(int resultado) {
        NotasOut notasOut = new NotasOut();
        notasOut.setResultado(resultado);
        return notasOut;
    }
}
