package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cupom_item;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id_cupom")
    private List<Cupom> listaCupom;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id_produto")
    private List<Produto> listaProduto;

    @Column(nullable = false, name = "qt_produto")
    private Long qt_produto;

    @Column(nullable = false, name = "vl_produto")
    private BigDecimal vl_produto;

}
