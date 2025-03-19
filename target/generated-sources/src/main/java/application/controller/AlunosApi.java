/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.54).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package application.controller;

import application.impacto_manager_web.model.AlunoGenerated;
import application.impacto_manager_web.model.ErrorResponseGenerated;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-03-19T15:52:55.998221102-03:00[America/Sao_Paulo]")
@Validated
public interface AlunosApi {

    Logger log = LoggerFactory.getLogger(AlunosApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @Operation(summary = "Novo Aluno", description = "", tags={ "Alunos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlunoGenerated.class))),
        
        @ApiResponse(responseCode = "400", description = "Requisição inválida.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))) })
    @RequestMapping(value = "/aluno",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    default ResponseEntity<AlunoGenerated> createAluno(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AlunoGenerated body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"telefone\" : \"telefone\",\n  \"endereco\" : {\n    \"cidade\" : \"cidade\",\n    \"complemento\" : \"complemento\",\n    \"bairro\" : \"bairro\",\n    \"numeroCasa\" : \"numeroCasa\",\n    \"cep\" : \"cep\",\n    \"rua\" : \"rua\"\n  },\n  \"cpf\" : \"cpf\",\n  \"nome\" : \"nome\",\n  \"id\" : \"id\",\n  \"sexo\" : \"MASCULINO\",\n  \"dataNascimento\" : \"2000-01-23\",\n  \"responsavel\" : [ {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  }, {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  } ]\n}", AlunoGenerated.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AlunosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Exclui aluno", description = "", tags={ "Alunos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK"),
        
        @ApiResponse(responseCode = "400", description = "Requisição inválida.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "404", description = "Aluno não encontrado.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))) })
    @RequestMapping(value = "/aluno/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deleteAluno(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AlunosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Buscar alunos", description = "", tags={ "Alunos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AlunoGenerated.class)))),
        
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))) })
    @RequestMapping(value = "/aluno",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<AlunoGenerated>> getAllAlunos() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\n  \"telefone\" : \"telefone\",\n  \"endereco\" : {\n    \"cidade\" : \"cidade\",\n    \"complemento\" : \"complemento\",\n    \"bairro\" : \"bairro\",\n    \"numeroCasa\" : \"numeroCasa\",\n    \"cep\" : \"cep\",\n    \"rua\" : \"rua\"\n  },\n  \"cpf\" : \"cpf\",\n  \"nome\" : \"nome\",\n  \"id\" : \"id\",\n  \"sexo\" : \"MASCULINO\",\n  \"dataNascimento\" : \"2000-01-23\",\n  \"responsavel\" : [ {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  }, {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  } ]\n}, {\n  \"telefone\" : \"telefone\",\n  \"endereco\" : {\n    \"cidade\" : \"cidade\",\n    \"complemento\" : \"complemento\",\n    \"bairro\" : \"bairro\",\n    \"numeroCasa\" : \"numeroCasa\",\n    \"cep\" : \"cep\",\n    \"rua\" : \"rua\"\n  },\n  \"cpf\" : \"cpf\",\n  \"nome\" : \"nome\",\n  \"id\" : \"id\",\n  \"sexo\" : \"MASCULINO\",\n  \"dataNascimento\" : \"2000-01-23\",\n  \"responsavel\" : [ {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  }, {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AlunosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Buscar aluno por CPF", description = "", tags={ "Alunos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlunoGenerated.class))),
        
        @ApiResponse(responseCode = "400", description = "Requisição inválida.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "404", description = "Aluno não encontrado.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))) })
    @RequestMapping(value = "/aluno/cpf/{cpf}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<AlunoGenerated> getAlunoByCpf(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="cpf", required=true) String cpf
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"telefone\" : \"telefone\",\n  \"endereco\" : {\n    \"cidade\" : \"cidade\",\n    \"complemento\" : \"complemento\",\n    \"bairro\" : \"bairro\",\n    \"numeroCasa\" : \"numeroCasa\",\n    \"cep\" : \"cep\",\n    \"rua\" : \"rua\"\n  },\n  \"cpf\" : \"cpf\",\n  \"nome\" : \"nome\",\n  \"id\" : \"id\",\n  \"sexo\" : \"MASCULINO\",\n  \"dataNascimento\" : \"2000-01-23\",\n  \"responsavel\" : [ {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  }, {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  } ]\n}", AlunoGenerated.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AlunosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Buscar alunos por nome", description = "", tags={ "Alunos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = AlunoGenerated.class)))),
        
        @ApiResponse(responseCode = "400", description = "Requisição inválida.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "404", description = "Aluno não encontrado.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))) })
    @RequestMapping(value = "/aluno/nome/{nome}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<AlunoGenerated>> getAlunoByNome(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="nome", required=true) String nome
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {\n  \"telefone\" : \"telefone\",\n  \"endereco\" : {\n    \"cidade\" : \"cidade\",\n    \"complemento\" : \"complemento\",\n    \"bairro\" : \"bairro\",\n    \"numeroCasa\" : \"numeroCasa\",\n    \"cep\" : \"cep\",\n    \"rua\" : \"rua\"\n  },\n  \"cpf\" : \"cpf\",\n  \"nome\" : \"nome\",\n  \"id\" : \"id\",\n  \"sexo\" : \"MASCULINO\",\n  \"dataNascimento\" : \"2000-01-23\",\n  \"responsavel\" : [ {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  }, {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  } ]\n}, {\n  \"telefone\" : \"telefone\",\n  \"endereco\" : {\n    \"cidade\" : \"cidade\",\n    \"complemento\" : \"complemento\",\n    \"bairro\" : \"bairro\",\n    \"numeroCasa\" : \"numeroCasa\",\n    \"cep\" : \"cep\",\n    \"rua\" : \"rua\"\n  },\n  \"cpf\" : \"cpf\",\n  \"nome\" : \"nome\",\n  \"id\" : \"id\",\n  \"sexo\" : \"MASCULINO\",\n  \"dataNascimento\" : \"2000-01-23\",\n  \"responsavel\" : [ {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  }, {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AlunosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @Operation(summary = "Editar dados", description = "", tags={ "Alunos" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AlunoGenerated.class))),
        
        @ApiResponse(responseCode = "400", description = "Requisição inválida.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "404", description = "Aluno não encontrado.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))),
        
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponseGenerated.class))) })
    @RequestMapping(value = "/aluno/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    default ResponseEntity<AlunoGenerated> updateAluno(@Parameter(in = ParameterIn.DEFAULT, description = "", required=true, schema=@Schema()) @Valid @RequestBody AlunoGenerated body
) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\n  \"telefone\" : \"telefone\",\n  \"endereco\" : {\n    \"cidade\" : \"cidade\",\n    \"complemento\" : \"complemento\",\n    \"bairro\" : \"bairro\",\n    \"numeroCasa\" : \"numeroCasa\",\n    \"cep\" : \"cep\",\n    \"rua\" : \"rua\"\n  },\n  \"cpf\" : \"cpf\",\n  \"nome\" : \"nome\",\n  \"id\" : \"id\",\n  \"sexo\" : \"MASCULINO\",\n  \"dataNascimento\" : \"2000-01-23\",\n  \"responsavel\" : [ {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  }, {\n    \"telefone\" : \"telefone\",\n    \"parentesco\" : \"parentesco\",\n    \"nome\" : \"nome\"\n  } ]\n}", AlunoGenerated.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default AlunosApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}

