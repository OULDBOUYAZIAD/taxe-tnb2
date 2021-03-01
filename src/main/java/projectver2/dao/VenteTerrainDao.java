package projectver2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import projectver2.bean.bean.VenteTerrain ;

import javax.transaction.Transactional;
import java.util.List;

public interface VenteTerrainDao extends JpaRepository<VenteTerrain,Long>  {
    VenteTerrain findByDateVenteAndLocalRef(String dateVente,String ref);
    @Transactional
    int deleteByDateVenteAndLocalRef(String dateVente,String ref);

    List<VenteTerrain> findByLocalRef(String ref) ;
    @Transactional
    int deleteByLocalRef(String ref) ;

    List<VenteTerrain> findByAncienProprietaireRef(String ref) ;
    @Transactional
    int deleteByAncienProprietaireRef(String ref) ;

    List<VenteTerrain> findByNouveauProprietaireRef(String ref) ;
    @Transactional
    int deleteByNouveauProprietaireRef(String ref) ;



}
