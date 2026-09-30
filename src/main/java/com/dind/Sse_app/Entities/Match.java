package com.dind.Sse_app.Entities;

import java.util.UUID;

import com.dind.Sse_app.Contracts.MatchSnapshot;
import com.dind.Sse_app.Enums.MatchStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor 
@AllArgsConstructor 
public class Match {
    private UUID id;
    private String homeTeam;
    private String awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private int homeTeamPenaltyScore;
    private int awayTeamPenaltyScore;
    private int minutes;
   private MatchStatus status;

   public MatchSnapshot snapshot(){
    return new MatchSnapshot();
   }

   public MatchSnapshot addGoal(){
    return new MatchSnapshot();
   }

   public void addPenalty(){

   }

   public void update(int minutes, MatchStatus status){
    
   }
}
