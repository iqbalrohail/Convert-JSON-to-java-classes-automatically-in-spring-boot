
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
    "score",
    "wicket",
    "ball"
})
public class TeamAScore {

    @JsonProperty("score")
    private Integer score;
    @JsonProperty("wicket")
    private Integer wicket;
    @JsonProperty("ball")
    private String ball;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("wicket")
    public Integer getWicket() {
        return wicket;
    }

    @JsonProperty("wicket")
    public void setWicket(Integer wicket) {
        this.wicket = wicket;
    }

    @JsonProperty("ball")
    public String getBall() {
        return ball;
    }

    @JsonProperty("ball")
    public void setBall(String ball) {
        this.ball = ball;
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
        sb.append(TeamAScore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        sb.append("wicket");
        sb.append('=');
        sb.append(((this.wicket == null)?"<null>":this.wicket));
        sb.append(',');
        sb.append("ball");
        sb.append('=');
        sb.append(((this.ball == null)?"<null>":this.ball));
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
        result = ((result* 31)+((this.score == null)? 0 :this.score.hashCode()));
        result = ((result* 31)+((this.ball == null)? 0 :this.ball.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.wicket == null)? 0 :this.wicket.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TeamAScore) == false) {
            return false;
        }
        TeamAScore rhs = ((TeamAScore) other);
        return (((((this.score == rhs.score)||((this.score!= null)&&this.score.equals(rhs.score)))&&((this.ball == rhs.ball)||((this.ball!= null)&&this.ball.equals(rhs.ball))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.wicket == rhs.wicket)||((this.wicket!= null)&&this.wicket.equals(rhs.wicket))));
    }

}
