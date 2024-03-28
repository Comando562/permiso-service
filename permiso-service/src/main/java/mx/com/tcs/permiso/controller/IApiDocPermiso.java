package mx.com.tcs.permiso.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import mx.com.tcs.permiso.model.response.PermisoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface IApiDocPermiso {

    @Operation(
            summary = "index",
            description = "Obtiene lista de registros de catpermiso"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", content ={
                    @Content(schema = @Schema(implementation = PermisoDTO.class), mediaType = "application/json")}),
            @ApiResponse(responseCode = "404", content = {@Content(schema = @Schema())}),
            @ApiResponse(responseCode = "500", content ={@Content(schema = @Schema())})
    })
    @GetMapping("/permiso")
    ResponseEntity<List<PermisoDTO>>getAll();
}
