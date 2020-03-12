package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cupom;

    @Column(nullable = false, name = "id_cliente")
    private Long idCliente;

    @Column(nullable = false, name = "dt_venda")
//    @Temporal(TemporalType.TIMESTAMP)
    private String dtVenda;

    @Column(nullable = false, name = "vl_venda")
    private BigDecimal vl_venda;
}
