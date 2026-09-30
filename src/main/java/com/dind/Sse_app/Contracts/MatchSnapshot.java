package com.dind.Sse_app.Contracts;

import java.util.UUID;

import com.dind.Sse_app.Enums.MatchStatus;

public record MatchSnapshot(UUID matchId, String home, String away, 
    int homeScore, int awayScore, int homePenaltyScore, int awayPenaltyScore, int minutes,
    MatchStatus status) {
}
