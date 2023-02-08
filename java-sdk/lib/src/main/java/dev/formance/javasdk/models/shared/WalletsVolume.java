package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WalletsVolume {
    @JsonProperty("balance")
    public Long balance;
    public WalletsVolume withBalance(Long balance) {
        this.balance = balance;
        return this;
    }
    @JsonProperty("input")
    public Long input;
    public WalletsVolume withInput(Long input) {
        this.input = input;
        return this;
    }
    @JsonProperty("output")
    public Long output;
    public WalletsVolume withOutput(Long output) {
        this.output = output;
        return this;
    }
}
