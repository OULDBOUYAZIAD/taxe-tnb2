package projectver2.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectver2.bean.CategorieTerrain;
import projectver2.service.CategorieTerrainService;


import javax.transaction.Transactional;


@RestController
@RequestMapping("taxe-terrain-non-batis/categorieTerrain")
public class  CategorieTerrainRest {



    @Autowired
    private CategorieTerrainService categorieTerrainService ;

    @GetMapping("/ref/{ref}")
    public CategorieTerrain findByRef(@PathVariable String ref) {
        return categorieTerrainService.findByRef(ref);
    }
    @DeleteMapping("/ref/{ref}")
    public int deleteByRef( @PathVariable String ref) {
        return categorieTerrainService.deleteByRef(ref);
    }


    @GetMapping("/libelle/{libelle}")
    public CategorieTerrain findByLibelle( @PathVariable String libelle) {
        return categorieTerrainService.findByLibelle(libelle);
    }
    @DeleteMapping("/libelle/{libelle}")
    public int deleteByLibelle( @PathVariable String libelle) {
        return categorieTerrainService.deleteByLibelle(libelle);
    }

    @GetMapping("/")
    public List<CategorieTerrain> findAll() {
        return categorieTerrainService.findAll();
    }

    @PostMapping("/")
    public int save( @RequestBody CategorieTerrain categorieTerrain) {
        return categorieTerrainService.save(categorieTerrain);
    }


}