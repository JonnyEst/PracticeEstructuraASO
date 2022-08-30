package facade.mapper;

import business.dto.NotasInt;
import business.dto.NotasOut;
import facade.dto.NotasEntrada;
import facade.dto.NotasSalida;

public interface InterfaceFacadeMapper {

    NotasInt MapeoEntrada(NotasEntrada notasEntrada);
    NotasSalida MapeoSalida(NotasOut notasOut);
}
