package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.CupomItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupomItemRepository extends JpaRepository<CupomItem, Long> {
}
