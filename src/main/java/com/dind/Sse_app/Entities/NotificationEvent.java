package com.dind.Sse_app.Entities;

import java.time.Instant;

public record NotificationEvent(String id, String message, Instant sentAt) {
    
}
