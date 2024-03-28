package mx.com.tcs.permiso.model.repository;

import mx.com.tcs.permiso.model.Permiso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermisoRepository extends CrudRepository<Permiso,Integer> {
}
