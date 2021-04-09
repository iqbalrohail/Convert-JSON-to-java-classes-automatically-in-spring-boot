
package com.example.com;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "match_id",
    "series",
    "match_date",
    "match_time",
    "matchs",
    "venue",
    "match_type",
    "match_status",
    "min_rate",
    "max_rate",
    "fav_team",
    "s_ovr",
    "s_min",
    "s_max",
    "session",
    "result",
    "team_a_id",
    "team_a",
    "team_a_short",
    "team_a_img",
    "team_a_score",
    "team_b_id",
    "team_b",
    "team_b_short",
    "team_b_img",
    "team_b_score"
})
public class HomeList {

    @JsonProperty("match_id")
    private Integer matchId;
    @JsonProperty("series")
    private String series;
    @JsonProperty("match_date")
    private String matchDate;
    @JsonProperty("match_time")
    private String matchTime;
    @JsonProperty("matchs")
    private String matchs;
    @JsonProperty("venue")
    private String venue;
    @JsonProperty("match_type")
    private String matchType;
    @JsonProperty("match_status")
    private String matchStatus;
    @JsonProperty("min_rate")
    private String minRate;
    @JsonProperty("max_rate")
    private String maxRate;
    @JsonProperty("fav_team")
    private String favTeam;
    @JsonProperty("s_ovr")
    private String sOvr;
    @JsonProperty("s_min")
    private String sMin;
    @JsonProperty("s_max")
    private String sMax;
    @JsonProperty("session")
    private Object session;
    @JsonProperty("result")
    private String result;
    @JsonProperty("team_a_id")
    private Integer teamAId;
    @JsonProperty("team_a")
    private String teamA;
    @JsonProperty("team_a_short")
    private String teamAShort;
    @JsonProperty("team_a_img")
    private String teamAImg;
    @JsonProperty("team_a_score")
    private TeamAScore teamAScore;
    @JsonProperty("team_b_id")
    private Integer teamBId;
    @JsonProperty("team_b")
    private String teamB;
    @JsonProperty("team_b_short")
    private String teamBShort;
    @JsonProperty("team_b_img")
    private String teamBImg;
    @JsonProperty("team_b_score")
    private TeamBScore teamBScore;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("match_id")
    public Integer getMatchId() {
        return matchId;
    }

    @JsonProperty("match_id")
    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    @JsonProperty("series")
    public String getSeries() {
        return series;
    }

    @JsonProperty("series")
    public void setSeries(String series) {
        this.series = series;
    }

    @JsonProperty("match_date")
    public String getMatchDate() {
        return matchDate;
    }

    @JsonProperty("match_date")
    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    @JsonProperty("match_time")
    public String getMatchTime() {
        return matchTime;
    }

    @JsonProperty("match_time")
    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    @JsonProperty("matchs")
    public String getMatchs() {
        return matchs;
    }

    @JsonProperty("matchs")
    public void setMatchs(String matchs) {
        this.matchs = matchs;
    }

    @JsonProperty("venue")
    public String getVenue() {
        return venue;
    }

    @JsonProperty("venue")
    public void setVenue(String venue) {
        this.venue = venue;
    }

    @JsonProperty("match_type")
    public String getMatchType() {
        return matchType;
    }

    @JsonProperty("match_type")
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    @JsonProperty("match_status")
    public String getMatchStatus() {
        return matchStatus;
    }

    @JsonProperty("match_status")
    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    @JsonProperty("min_rate")
    public String getMinRate() {
        return minRate;
    }

    @JsonProperty("min_rate")
    public void setMinRate(String minRate) {
        this.minRate = minRate;
    }

    @JsonProperty("max_rate")
    public String getMaxRate() {
        return maxRate;
    }

    @JsonProperty("max_rate")
    public void setMaxRate(String maxRate) {
        this.maxRate = maxRate;
    }

    @JsonProperty("fav_team")
    public String getFavTeam() {
        return favTeam;
    }

    @JsonProperty("fav_team")
    public void setFavTeam(String favTeam) {
        this.favTeam = favTeam;
    }

    @JsonProperty("s_ovr")
    public String getsOvr() {
        return sOvr;
    }

    @JsonProperty("s_ovr")
    public void setsOvr(String sOvr) {
        this.sOvr = sOvr;
    }

    @JsonProperty("s_min")
    public String getsMin() {
        return sMin;
    }

    @JsonProperty("s_min")
    public void setsMin(String sMin) {
        this.sMin = sMin;
    }

    @JsonProperty("s_max")
    public String getsMax() {
        return sMax;
    }

    @JsonProperty("s_max")
    public void setsMax(String sMax) {
        this.sMax = sMax;
    }

    @JsonProperty("session")
    public Object getSession() {
        return session;
    }

    @JsonProperty("session")
    public void setSession(Object session) {
        this.session = session;
    }

    @JsonProperty("result")
    public String getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(String result) {
        this.result = result;
    }

    @JsonProperty("team_a_id")
    public Integer getTeamAId() {
        return teamAId;
    }

    @JsonProperty("team_a_id")
    public void setTeamAId(Integer teamAId) {
        this.teamAId = teamAId;
    }

    @JsonProperty("team_a")
    public String getTeamA() {
        return teamA;
    }

    @JsonProperty("team_a")
    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    @JsonProperty("team_a_short")
    public String getTeamAShort() {
        return teamAShort;
    }

    @JsonProperty("team_a_short")
    public void setTeamAShort(String teamAShort) {
        this.teamAShort = teamAShort;
    }

    @JsonProperty("team_a_img")
    public String getTeamAImg() {
        return teamAImg;
    }

    @JsonProperty("team_a_img")
    public void setTeamAImg(String teamAImg) {
        this.teamAImg = teamAImg;
    }

    @JsonProperty("team_a_score")
    public TeamAScore getTeamAScore() {
        return teamAScore;
    }

    @JsonProperty("team_a_score")
    public void setTeamAScore(TeamAScore teamAScore) {
        this.teamAScore = teamAScore;
    }

    @JsonProperty("team_b_id")
    public Integer getTeamBId() {
        return teamBId;
    }

    @JsonProperty("team_b_id")
    public void setTeamBId(Integer teamBId) {
        this.teamBId = teamBId;
    }

    @JsonProperty("team_b")
    public String getTeamB() {
        return teamB;
    }

    @JsonProperty("team_b")
    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }

    @JsonProperty("team_b_short")
    public String getTeamBShort() {
        return teamBShort;
    }

    @JsonProperty("team_b_short")
    public void setTeamBShort(String teamBShort) {
        this.teamBShort = teamBShort;
    }

    @JsonProperty("team_b_img")
    public String getTeamBImg() {
        return teamBImg;
    }

    @JsonProperty("team_b_img")
    public void setTeamBImg(String teamBImg) {
        this.teamBImg = teamBImg;
    }

    @JsonProperty("team_b_score")
    public TeamBScore getTeamBScore() {
        return teamBScore;
    }

    @JsonProperty("team_b_score")
    public void setTeamBScore(TeamBScore teamBScore) {
        this.teamBScore = teamBScore;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HomeList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matchId");
        sb.append('=');
        sb.append(((this.matchId == null)?"<null>":this.matchId));
        sb.append(',');
        sb.append("series");
        sb.append('=');
        sb.append(((this.series == null)?"<null>":this.series));
        sb.append(',');
        sb.append("matchDate");
        sb.append('=');
        sb.append(((this.matchDate == null)?"<null>":this.matchDate));
        sb.append(',');
        sb.append("matchTime");
        sb.append('=');
        sb.append(((this.matchTime == null)?"<null>":this.matchTime));
        sb.append(',');
        sb.append("matchs");
        sb.append('=');
        sb.append(((this.matchs == null)?"<null>":this.matchs));
        sb.append(',');
        sb.append("venue");
        sb.append('=');
        sb.append(((this.venue == null)?"<null>":this.venue));
        sb.append(',');
        sb.append("matchType");
        sb.append('=');
        sb.append(((this.matchType == null)?"<null>":this.matchType));
        sb.append(',');
        sb.append("matchStatus");
        sb.append('=');
        sb.append(((this.matchStatus == null)?"<null>":this.matchStatus));
        sb.append(',');
        sb.append("minRate");
        sb.append('=');
        sb.append(((this.minRate == null)?"<null>":this.minRate));
        sb.append(',');
        sb.append("maxRate");
        sb.append('=');
        sb.append(((this.maxRate == null)?"<null>":this.maxRate));
        sb.append(',');
        sb.append("favTeam");
        sb.append('=');
        sb.append(((this.favTeam == null)?"<null>":this.favTeam));
        sb.append(',');
        sb.append("sOvr");
        sb.append('=');
        sb.append(((this.sOvr == null)?"<null>":this.sOvr));
        sb.append(',');
        sb.append("sMin");
        sb.append('=');
        sb.append(((this.sMin == null)?"<null>":this.sMin));
        sb.append(',');
        sb.append("sMax");
        sb.append('=');
        sb.append(((this.sMax == null)?"<null>":this.sMax));
        sb.append(',');
        sb.append("session");
        sb.append('=');
        sb.append(((this.session == null)?"<null>":this.session));
        sb.append(',');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("teamAId");
        sb.append('=');
        sb.append(((this.teamAId == null)?"<null>":this.teamAId));
        sb.append(',');
        sb.append("teamA");
        sb.append('=');
        sb.append(((this.teamA == null)?"<null>":this.teamA));
        sb.append(',');
        sb.append("teamAShort");
        sb.append('=');
        sb.append(((this.teamAShort == null)?"<null>":this.teamAShort));
        sb.append(',');
        sb.append("teamAImg");
        sb.append('=');
        sb.append(((this.teamAImg == null)?"<null>":this.teamAImg));
        sb.append(',');
        sb.append("teamAScore");
        sb.append('=');
        sb.append(((this.teamAScore == null)?"<null>":this.teamAScore));
        sb.append(',');
        sb.append("teamBId");
        sb.append('=');
        sb.append(((this.teamBId == null)?"<null>":this.teamBId));
        sb.append(',');
        sb.append("teamB");
        sb.append('=');
        sb.append(((this.teamB == null)?"<null>":this.teamB));
        sb.append(',');
        sb.append("teamBShort");
        sb.append('=');
        sb.append(((this.teamBShort == null)?"<null>":this.teamBShort));
        sb.append(',');
        sb.append("teamBImg");
        sb.append('=');
        sb.append(((this.teamBImg == null)?"<null>":this.teamBImg));
        sb.append(',');
        sb.append("teamBScore");
        sb.append('=');
        sb.append(((this.teamBScore == null)?"<null>":this.teamBScore));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.venue == null)? 0 :this.venue.hashCode()));
        result = ((result* 31)+((this.matchDate == null)? 0 :this.matchDate.hashCode()));
        result = ((result* 31)+((this.matchs == null)? 0 :this.matchs.hashCode()));
        result = ((result* 31)+((this.sMax == null)? 0 :this.sMax.hashCode()));
        result = ((result* 31)+((this.matchType == null)? 0 :this.matchType.hashCode()));
        result = ((result* 31)+((this.session == null)? 0 :this.session.hashCode()));
        result = ((result* 31)+((this.teamAId == null)? 0 :this.teamAId.hashCode()));
        result = ((result* 31)+((this.sOvr == null)? 0 :this.sOvr.hashCode()));
        result = ((result* 31)+((this.teamBScore == null)? 0 :this.teamBScore.hashCode()));
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.matchStatus == null)? 0 :this.matchStatus.hashCode()));
        result = ((result* 31)+((this.teamAShort == null)? 0 :this.teamAShort.hashCode()));
        result = ((result* 31)+((this.teamA == null)? 0 :this.teamA.hashCode()));
        result = ((result* 31)+((this.teamB == null)? 0 :this.teamB.hashCode()));
        result = ((result* 31)+((this.teamAImg == null)? 0 :this.teamAImg.hashCode()));
        result = ((result* 31)+((this.matchId == null)? 0 :this.matchId.hashCode()));
        result = ((result* 31)+((this.teamAScore == null)? 0 :this.teamAScore.hashCode()));
        result = ((result* 31)+((this.sMin == null)? 0 :this.sMin.hashCode()));
        result = ((result* 31)+((this.matchTime == null)? 0 :this.matchTime.hashCode()));
        result = ((result* 31)+((this.maxRate == null)? 0 :this.maxRate.hashCode()));
        result = ((result* 31)+((this.favTeam == null)? 0 :this.favTeam.hashCode()));
        result = ((result* 31)+((this.teamBId == null)? 0 :this.teamBId.hashCode()));
        result = ((result* 31)+((this.teamBShort == null)? 0 :this.teamBShort.hashCode()));
        result = ((result* 31)+((this.series == null)? 0 :this.series.hashCode()));
        result = ((result* 31)+((this.minRate == null)? 0 :this.minRate.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.teamBImg == null)? 0 :this.teamBImg.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HomeList) == false) {
            return false;
        }
        HomeList rhs = ((HomeList) other);
        return ((((((((((((((((((((((((((((this.venue == rhs.venue)||((this.venue!= null)&&this.venue.equals(rhs.venue)))&&((this.matchDate == rhs.matchDate)||((this.matchDate!= null)&&this.matchDate.equals(rhs.matchDate))))&&((this.matchs == rhs.matchs)||((this.matchs!= null)&&this.matchs.equals(rhs.matchs))))&&((this.sMax == rhs.sMax)||((this.sMax!= null)&&this.sMax.equals(rhs.sMax))))&&((this.matchType == rhs.matchType)||((this.matchType!= null)&&this.matchType.equals(rhs.matchType))))&&((this.session == rhs.session)||((this.session!= null)&&this.session.equals(rhs.session))))&&((this.teamAId == rhs.teamAId)||((this.teamAId!= null)&&this.teamAId.equals(rhs.teamAId))))&&((this.sOvr == rhs.sOvr)||((this.sOvr!= null)&&this.sOvr.equals(rhs.sOvr))))&&((this.teamBScore == rhs.teamBScore)||((this.teamBScore!= null)&&this.teamBScore.equals(rhs.teamBScore))))&&((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result))))&&((this.matchStatus == rhs.matchStatus)||((this.matchStatus!= null)&&this.matchStatus.equals(rhs.matchStatus))))&&((this.teamAShort == rhs.teamAShort)||((this.teamAShort!= null)&&this.teamAShort.equals(rhs.teamAShort))))&&((this.teamA == rhs.teamA)||((this.teamA!= null)&&this.teamA.equals(rhs.teamA))))&&((this.teamB == rhs.teamB)||((this.teamB!= null)&&this.teamB.equals(rhs.teamB))))&&((this.teamAImg == rhs.teamAImg)||((this.teamAImg!= null)&&this.teamAImg.equals(rhs.teamAImg))))&&((this.matchId == rhs.matchId)||((this.matchId!= null)&&this.matchId.equals(rhs.matchId))))&&((this.teamAScore == rhs.teamAScore)||((this.teamAScore!= null)&&this.teamAScore.equals(rhs.teamAScore))))&&((this.sMin == rhs.sMin)||((this.sMin!= null)&&this.sMin.equals(rhs.sMin))))&&((this.matchTime == rhs.matchTime)||((this.matchTime!= null)&&this.matchTime.equals(rhs.matchTime))))&&((this.maxRate == rhs.maxRate)||((this.maxRate!= null)&&this.maxRate.equals(rhs.maxRate))))&&((this.favTeam == rhs.favTeam)||((this.favTeam!= null)&&this.favTeam.equals(rhs.favTeam))))&&((this.teamBId == rhs.teamBId)||((this.teamBId!= null)&&this.teamBId.equals(rhs.teamBId))))&&((this.teamBShort == rhs.teamBShort)||((this.teamBShort!= null)&&this.teamBShort.equals(rhs.teamBShort))))&&((this.series == rhs.series)||((this.series!= null)&&this.series.equals(rhs.series))))&&((this.minRate == rhs.minRate)||((this.minRate!= null)&&this.minRate.equals(rhs.minRate))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.teamBImg == rhs.teamBImg)||((this.teamBImg!= null)&&this.teamBImg.equals(rhs.teamBImg))));
    }

}
