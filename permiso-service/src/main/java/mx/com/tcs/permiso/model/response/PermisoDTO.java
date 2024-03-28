package mx.com.tcs.permiso.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * @author luis
 * @since 1.0
 *
 * Object Permiso used in the API response of catpermiso-service.
 */
@Schema(name = "Permiso")
@Setter
@Getter
public class PermisoDTO {
    /**
     * Identifier of Permiso data.
     */
    @Schema(type = "integer", description = "Id del catalogo", example = "2")
    @JsonProperty("id")
    private Integer id;
    /**
     * Name of Permiso data.
     */
    @Schema(type = "string", description = "Nombre del permiso", example = "Academico")
    @JsonProperty("nombre")
    private String nombre;
    /**
     * Description of name.
     */
    @Schema(type = "string", description = "Descripcion del permiso", example = "Fundamento")
    @JsonProperty("descripcion")
    private String descripcion;
    /**
     * Attribute to identify if it is active (1) or not (0)
     */
    @Schema(type = "integer", description = "Activo/Desactivado", example = "1")
    @JsonProperty("activo")
    private Integer activo;
    /**
     * Used to know it it belongs the category.
     */
    @Schema(type = "integer", description = "El id del Padre", example = "1")
    @JsonProperty("idPadre")
    private Integer idPadre;
    /**
     * Path were the icon image is stored.
     */
    @Schema(type = "string", description = "El id del Padre", example = "1")
    @JsonProperty("icono")
    private String icono;
}
