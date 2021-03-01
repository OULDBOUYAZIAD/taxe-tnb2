package projectver2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectver2.bean.CategorieTerrain;
import projectver2.bean.bean.VenteTerrain;
import projectver2.dao.CategorieTerrainDao;
import projectver2.dao.VenteTerrainDao;


import javax.transaction.Transactional;

@Service
public class VenteTerrainService {
    @Autowired
    private VenteTerrainDao venteTerrainDao;
    @Autowired
    private  TerrainService terrainService ;
    @Autowired
    private  RedevableService redevableService ;

    public VenteTerrain findByDateVenteAndLocalRef(String dateVente, String ref) {
        return venteTerrainDao.findByDateVenteAndLocalRef(dateVente, ref);
    }

    @Transactional
    public int deleteByDateVenteAndLocalRef(String dateVente, String ref) {
        return venteTerrainDao.deleteByDateVenteAndLocalRef(dateVente, ref);
    }

    public List<VenteTerrain> findByLocalRef(String ref) {
        return venteTerrainDao.findByLocalRef(ref);
    }

    @Transactional
    public int deleteByLocalRef(String ref) {
        return venteTerrainDao.deleteByLocalRef(ref);
    }

    public List<VenteTerrain> findByAncienProprietaireRef(String ref) {
        return venteTerrainDao.findByAncienProprietaireRef(ref);
    }

    @Transactional
    public int deleteByAncienProprietaireRef(String ref) {
        return venteTerrainDao.deleteByAncienProprietaireRef(ref);
    }

    public List<VenteTerrain> findByNouveauProprietaireRef(String ref) {
        return venteTerrainDao.findByNouveauProprietaireRef(ref);
    }

    @Transactional
    public int deleteByNouveauProprietaireRef(String ref) {
        return venteTerrainDao.deleteByNouveauProprietaireRef(ref);
    }

    public List<VenteTerrain> findAll() {
        return venteTerrainDao.findAll();
    }

    public int save(VenteTerrain venteTerrain) {
         Terrain terrain = terrainService.findByRef(venteTerrain.getLocal().getRef());
         venteTerrain.setTerrain(terrain);
         Redevable ancienProprietaire = redevableService.findByRef(venteTerrain.getAncienProprietaire().getRef());
         venteTerrain.setAncienProprietaire(ancienProprietaire);
         Redevable nouveauProprietaire = redevableService.findByRef(venteTerrain.getNouveauProprietaire().getRef());
        venteTerrain.setNouveauProprietaire(nouveauProprietaire);
       if(terrain == null )
       {
           return -1;
       }
       else if (ancienProprietaire== null)
       {
           return  -2;
       }
       else if (nouveauProprietaire== null)
       {
           return  -3;
       }

       else {
            terrainService.update(terrain);
            venteTerrainDao.save(venteTerrain);
            return 1;
        }

    }




}
