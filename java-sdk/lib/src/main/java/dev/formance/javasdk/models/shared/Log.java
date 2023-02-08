package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import dev.formance.javasdk.utils.DateTimeDeserializer;
import dev.formance.javasdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;

public class Log {
    @JsonProperty("data")
    public java.util.Map<String, Object> data;
    public Log withData(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date")
    public OffsetDateTime date;
    public Log withDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }
    @JsonProperty("hash")
    public String hash;
    public Log withHash(String hash) {
        this.hash = hash;
        return this;
    }
    @JsonProperty("id")
    public Long id;
    public Log withId(Long id) {
        this.id = id;
        return this;
    }
    @JsonProperty("type")
    public LogTypeEnum type;
    public Log withType(LogTypeEnum type) {
        this.type = type;
        return this;
    }
}
