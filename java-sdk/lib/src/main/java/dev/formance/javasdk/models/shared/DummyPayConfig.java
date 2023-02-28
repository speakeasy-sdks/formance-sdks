package dev.formance.javasdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class DummyPayConfig {
    @JsonProperty("directory")
    public String directory;
    public DummyPayConfig withDirectory(String directory) {
        this.directory = directory;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fileGenerationPeriod")
    public String fileGenerationPeriod;
    public DummyPayConfig withFileGenerationPeriod(String fileGenerationPeriod) {
        this.fileGenerationPeriod = fileGenerationPeriod;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filePollingPeriod")
    public String filePollingPeriod;
    public DummyPayConfig withFilePollingPeriod(String filePollingPeriod) {
        this.filePollingPeriod = filePollingPeriod;
        return this;
    }
    
}
