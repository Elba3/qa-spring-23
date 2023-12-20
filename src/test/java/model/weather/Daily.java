package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Daily {
    @JsonProperty("daily")
    private List<Daily> dailies;
    private long dt;
    private long sunrise;
    private long sunset;
    private long moonrise;
    private long moonset;
    @JsonProperty("moon_phase")
    private double moonPhase;

}
