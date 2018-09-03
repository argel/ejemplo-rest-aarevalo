package cl.aarevalo.ejemplo.consumirrest.clients;

import cl.aarevalo.ejemplo.consumirrest.clients.domain.Sector;
import feign.RequestLine;

import java.util.List;

public interface DpaClient {
    @RequestLine("GET /regiones")
    List<Sector> obtenerRegiones();
}
