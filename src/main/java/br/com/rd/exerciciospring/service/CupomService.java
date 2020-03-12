package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.repository.CupomRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("CupomService")
public class CupomService {

    @Autowired
    private CupomRepository cupomRepository;

    public ResponseEntity<List<Cupom>> listarCupomByDataECliente (Long cupomId, String cupomData) {
        return ResponseEntity.ok().body(cupomRepository.findByIdClienteAndDtVenda(cupomId, cupomData));
    }

    public ResponseEntity salvarCupom (Cupom cupom) {
        return ResponseEntity.ok().body(cupomRepository.save(cupom));
    }

    public ResponseEntity<List<Cupom>> listarCupons () {
        return ResponseEntity.ok().body(cupomRepository.findAll());
    }

}
