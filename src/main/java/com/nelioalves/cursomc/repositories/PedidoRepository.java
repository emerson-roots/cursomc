package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nelioalves.cursomc.domain.Pedido;

// aula 17 - 10:57 - repositories sao capazes de operações d acesso a dados (alterar, inserir, deletar, etx...)
// JpaRepository - é um tipo especial do spring capaz de acessar dados com base em um tipo, neste caso Pedido
// e o atributo identificador que no caso sao as IDs dos dados
@Repository 
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
