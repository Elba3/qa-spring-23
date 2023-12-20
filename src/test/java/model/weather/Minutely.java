package model.weather;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Minutely {
    @JsonProperty("minutely")
    private List<Minutely> minutelies;
    private long dt;
    private int precipitation;

    public List<Minutely> getMinutelies() {
        return minutelies;
    }

    public void setMinutelies(List<Minutely> minutelies) {
        this.minutelies = minutelies;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public int getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(int precipitation) {
        this.precipitation = precipitation;
    }
}
