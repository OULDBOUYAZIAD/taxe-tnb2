package projectver2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projectver2.bean.CategorieTerrain;


import java.util.List;


@Repository
public interface CategorieTerrainDao extends JpaRepository<CategorieTerrain,Long> {


    CategorieTerrain findByRef(String ref);
    int deleteByRef(String ref );
    CategorieTerrain findByLibelle(String libelle);
    int deleteByLibelle(String libelle);

}
