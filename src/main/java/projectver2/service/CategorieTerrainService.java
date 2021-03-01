package projectver2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projectver2.bean.CategorieTerrain;
import projectver2.dao.CategorieTerrainDao;


import javax.transaction.Transactional;

@Service
public class CategorieTerrainService {
    @Autowired
    private CategorieTerrainDao categorieTerrainDao;



    public CategorieTerrain findByRef(String ref) {
        return categorieTerrainDao.findByRef(ref);
    }

    @Transactional
    public int deleteByRef(String ref)
    {
        return categorieTerrainDao.deleteByRef(ref);
    }


    public List<CategorieTerrain> findAll() {
        return categorieTerrainDao.findAll();
    }

    public CategorieTerrain findByLibelle(String libelle) {
        return categorieTerrainDao.findByLibelle(libelle);
    }

    public int deleteByLibelle(String libelle) {
        return categorieTerrainDao.deleteByLibelle(libelle);
    }

    public int save(CategorieTerrain categorieTerrain) {

        if (findByRef(categorieTerrain.getRef()) != null) {
            return -1;

        } else {
            categorieTerrainDao.save(categorieTerrain);
            return 1;
        }

    }

}
