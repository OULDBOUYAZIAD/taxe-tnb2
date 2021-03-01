package projectver2.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projectver2.bean.bean.VenteTerrain;
import projectver2.service.VenteTerrainService;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("taxe-terrain-non-batis/VenteTerrainRest")
public class VenteTerrainRest {

    @Autowired
    private VenteTerrainService venteTerrainService ;

    @GetMapping("/datevente/{datevente}/local/ref/{ref}")
    public VenteTerrain findByDateVenteAndLocalRef(String dateVente, String ref) {
        return venteTerrainService.findByDateVenteAndLocalRef(dateVente, ref);
    }

    @DeleteMapping("/datevente/{datevente}/local/ref/{ref}")
    public int deleteByDateVenteAndTerrainLocalRef( @PathVariable String dateVente,@PathVariable String ref) {
        return venteTerrainService.deleteByDateVenteAndLocalRef(dateVente, ref);
    }
    @GetMapping("local/ref/{ref}")
    public List<VenteTerrain> findByLocalRef(@PathVariable String ref) {
        return venteTerrainService.findByLocalRef(ref);
    }

    @DeleteMapping("local/ref/{ref}")
    public int deleteByLocalRef(@PathVariable String ref) {
        return venteTerrainService.deleteByLocalRef(ref);
    }
    @GetMapping("ancienProprietaire/ref/{ref}")
    public List<VenteTerrain> findByAncienProprietaireRef(@PathVariable String ref) {
        return venteTerrainService.findByAncienProprietaireRef(ref);
    }

    @DeleteMapping("ancienProprietaire/ref/{ref}")
    public int deleteByAncienProprietaireRef(@PathVariable String ref) {
        return venteTerrainService.deleteByAncienProprietaireRef(ref);
    }
    @GetMapping("nouveauProprietaire/ref/{ref}")
    public List<VenteTerrain> findByNouveauProprietaireRef( @PathVariable String ref) {
        return venteTerrainService.findByNouveauProprietaireRef(ref);
    }

    @DeleteMapping("nouveauProprietaire/ref/{ref}")
    public int deleteByNouveauProprietaireRef(@PathVariable String ref) {
        return venteTerrainService.deleteByNouveauProprietaireRef(ref);
    }
    @GetMapping("/")
    public List<VenteTerrain> findAll() {
        return venteTerrainService.findAll();
    }
    @PostMapping("/")
    public int save(@RequestBody VenteTerrain venteTerrain) {
        return venteTerrainService.save(venteTerrain);
    }




}
