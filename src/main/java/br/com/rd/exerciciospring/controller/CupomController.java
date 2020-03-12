package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.model.Cupom;
import br.com.rd.exerciciospring.service.CupomService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class CupomController {

    @Autowired
    private CupomService cupomService;

    @GetMapping("/cupom-lista")
    public ResponseEntity<List<Cupom>> listarCupons(@PathParam("cliente") Long id_cli, @PathParam("data") String dt_venda) {
        List<Cupom> cupomList = new ArrayList<>();
        if (id_cli != null && dt_venda != null) {
            cupomList = (List<Cupom>) cupomService.listarCupomByDataECliente(id_cli, dt_venda);
        }

        if (cupomList != null && cupomList.size() > 0) {
            return ResponseEntity.ok().body(cupomList);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/cupom")
    public ResponseEntity salvarCupom (@RequestBody Cupom cupom) {
        return ResponseEntity.ok().body(cupomService.salvarCupom(cupom));
    }
}
