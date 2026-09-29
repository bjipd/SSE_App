// package com.dind.Sse_app.Services;

// import java.util.*;
// import java.util.concurrent.ConcurrentHashMap;
// import java.util.concurrent.CopyOnWriteArrayList;

// import org.springframework.stereotype.Service;
// import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

// @Service 
// public class SseService {
    
//     private static final long TIMEOUT_MS = 30 * 60 * 1000L;

//     //emitters is the registry. string for userid and list of events, ccHMap is thread safe
//     private final Map<String, List<SseEmitter>> emitters = new ConcurrentHashMap<>();

//     public SseEmitter subscribe(String userId) {
//         SseEmitter emitter = new SseEmitter(TIMEOUT_MS);

//         // Add the emitter to the list for the user
//         emitters.computeIfAbsent(userId, k -> new CopyOnWriteArrayList<>()).add(emitter);

//         emitter.onCompletion(() -> remove(userId, emitter));
//         emitter.onTimeout(() -> remove(userId, emitter));
//         emitter.onError((e) -> remove(userId, emitter));

//         send(emitter, "Connected", "ok");
//         return emitter;
//     }

//     public void publish()
// }
