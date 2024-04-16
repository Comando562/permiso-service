package mx.com.tcs.permiso.model.repository;

import mx.com.tcs.permiso.model.entity.Permiso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermisoRepository extends CrudRepository<Permiso,Integer> {
    /**
     * Method to find List of Permiso where the query parameter are the Identifiers and active status.
     * @param ids List of Identifiers of Permiso.
     * @param activo Active status of record.
     * @return List of Permiso entities.
     */
    List<Permiso> findByIdInAndActivo(List<Integer> ids, Integer activo);
}
