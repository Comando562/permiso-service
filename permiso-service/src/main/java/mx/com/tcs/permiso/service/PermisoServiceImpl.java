package mx.com.tcs.permiso.service;

import mx.com.tcs.permiso.model.Permiso;
import mx.com.tcs.permiso.model.repository.PermisoRepository;
import mx.com.tcs.permiso.model.response.PermisoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author luis
 * @since 1.0
 *
 * Class to implement methods used in the service layer of API catpermiso-service.
 */
@Service
public class PermisoServiceImpl implements  IPermisoService {

    /**
     * Implements the method to get all records of Permiso entity.
     * @return a response entity of the list of the Permiso object.
     */
    @Autowired
    private PermisoRepository repository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ResponseEntity<List<PermisoDTO>> listAll() {
        return ResponseEntity.ok(getAllPermiso());
    }

    /**
     * Method to query from Permiso entity.
     * @return a list of Permiso object.
     */
    private List<PermisoDTO> getAllPermiso() {
        List<PermisoDTO> permisoDTOList = new ArrayList<>();

        List<Permiso> permisoList = (List<Permiso>) repository.findAll();
        System.out.println("respuesta de permiso list");
        permisoList.forEach(System.out::println);
        permisoDTOList = permisoList
                .stream()
                .map(permiso -> modelMapper.map(permiso, PermisoDTO.class))
                .collect(Collectors.toList());
        System.out.println("Se ejecuto bien el permiso Service");

        return permisoDTOList;
    }
}
