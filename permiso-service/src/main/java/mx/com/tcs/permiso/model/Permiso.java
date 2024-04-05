package mx.com.tcs.permiso.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
public class Permiso {
    /**
     * Identifier of Permiso data.
     */
    @Id
    @Column
    private Integer id;
    /**
     * Name of Permiso data.
     */
    @Column
    private String nombre;
    /**
     * Description of name.
     */
    @Column
    private String descripcion;
    /**
     * Attribute to identify if it is active (1) or not (0)
     */
    @Column
    private Integer activo;
    /**
     * Used to know it it belongs the category.
     */
    @Column
    private Integer idPadre;
    /**
     * Path were the icon image is stored.
     */
    @Column
    private String icono;
}
