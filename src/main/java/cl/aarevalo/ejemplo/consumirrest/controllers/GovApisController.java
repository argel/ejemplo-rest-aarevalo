package cl.aarevalo.ejemplo.consumirrest.controllers;

import cl.aarevalo.ejemplo.consumirrest.clients.DpaClient;
import cl.aarevalo.ejemplo.consumirrest.clients.domain.Sector;
import feign.Feign;
import feign.Logger;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GovApisController {

    @GetMapping("/regiones")
    public List<Sector> obtenerRegiones() {
        DpaClient dpaClient = Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(DpaClient.class))
                .logLevel(Logger.Level.FULL)
                .target(DpaClient.class, "https://apis.digital.gob.cl/dpa");

        return dpaClient.obtenerRegiones();
    }
}
