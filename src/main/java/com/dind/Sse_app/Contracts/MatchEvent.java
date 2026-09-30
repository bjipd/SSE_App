package com.dind.Sse_app.Contracts;

import com.dind.Sse_app.Enums.MatchType;

public record MatchEvent(MatchType type, String team, String player, int minute) {
    
}
