package com.dind.Sse_app.Services;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

@Service 
public class SseService {
    
    private static final long TIMEOUT_MS = 30 * 60 * 1000L;

    //emitters is the registry. 
    private final Map<String, List<SseEmitter>> emitters = new ConcurrentHashMap<>();
}
