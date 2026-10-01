package com.dind.Sse_app.Entities;

import java.util.UUID;

import com.dind.Sse_app.Contracts.MatchSnapshot;
import com.dind.Sse_app.Enums.MatchStatus;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor 
public class Match {
    private final UUID id;
    private final String homeTeam;
    private final String awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private int homeTeamPenaltyScore;
    private int awayTeamPenaltyScore;
    private int minutes;
    private MatchStatus status = MatchStatus.NOT_STARTED;

    // synchronized: only one thread at a time may run any synchronized method of the SAME Match.
   public synchronized MatchSnapshot snapshot(){
    return new MatchSnapshot();
   }

   public synchronized MatchSnapshot addGoal(){
    return new MatchSnapshot();
   }

   public synchronized MatchSnapshot addPenalty(){
    return new MatchSnapshot();
   }

   public synchronized MatchSnapshot update(int minutes, MatchStatus status){
    return new MatchSnapshot();
   }
}
