package com.dind.Sse_app.Controllers;

import java.io.IOException;
import java.nio.file.*;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerSentEvent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;

@RestController 
@RequestMapping("/events")
public class MatchController {
    @GetMapping (produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    //using flux to return a stream of events, this is the endpoint that the client will subscribe to
    public Flux<ServerSentEvent<String>> getEvents() throws IOException {
        
        Stream<String> lines = Files.lines(Path.of("/Users/user/Desktop/Java_Apps/SSE_App/Sse_app/pom.xml"));

        AtomicInteger counter = new AtomicInteger(1);

        return Flux.fromStream(lines)
        .filter(line -> !line.isBlank())
        .map(line -> ServerSentEvent.<String> builder()
            .id(String.valueOf(counter.getAndIncrement()))
            .data(line)
            .event("lineEvent")
            .retry(Duration.ofMillis(1000))
            .build())
        .delayElements(Duration.ofMillis(300));
    }
}
