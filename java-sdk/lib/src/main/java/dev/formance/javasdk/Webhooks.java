package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import dev.formance.javasdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Webhooks {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Webhooks(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * activateConfig - Activate one config
     *
     * Activate a webhooks config by ID, to start receiving webhooks to its endpoint.
    **/
    public dev.formance.javasdk.models.operations.ActivateConfigResponse activateConfig(dev.formance.javasdk.models.operations.ActivateConfigRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/webhooks/configs/{id}/activate", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.ActivateConfigResponse res = new dev.formance.javasdk.models.operations.ActivateConfigResponse() {{
            configResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ConfigResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConfigResponse.class);
                res.configResponse = out;
            }
        }
        else if (httpRes.statusCode() == 304) {
        }

        return res;
    }
    
    /**
     * changeConfigSecret - Change the signing secret of a config
     *
     * Change the signing secret of the endpoint of a webhooks config.
     * 
     * If not passed or empty, a secret is automatically generated.
     * The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)
     * 
    **/
    public dev.formance.javasdk.models.operations.ChangeConfigSecretResponse changeConfigSecret(dev.formance.javasdk.models.operations.ChangeConfigSecretRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/webhooks/configs/{id}/secret/change", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.ChangeConfigSecretResponse res = new dev.formance.javasdk.models.operations.ChangeConfigSecretResponse() {{
            configResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ConfigResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConfigResponse.class);
                res.configResponse = out;
            }
        }

        return res;
    }
    
    /**
     * deactivateConfig - Deactivate one config
     *
     * Deactivate a webhooks config by ID, to stop receiving webhooks to its endpoint.
    **/
    public dev.formance.javasdk.models.operations.DeactivateConfigResponse deactivateConfig(dev.formance.javasdk.models.operations.DeactivateConfigRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/webhooks/configs/{id}/deactivate", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.DeactivateConfigResponse res = new dev.formance.javasdk.models.operations.DeactivateConfigResponse() {{
            configResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ConfigResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConfigResponse.class);
                res.configResponse = out;
            }
        }
        else if (httpRes.statusCode() == 304) {
        }

        return res;
    }
    
    /**
     * deleteConfig - Delete one config
     *
     * Delete a webhooks config by ID.
    **/
    public dev.formance.javasdk.models.operations.DeleteConfigResponse deleteConfig(dev.formance.javasdk.models.operations.DeleteConfigRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/webhooks/configs/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.DeleteConfigResponse res = new dev.formance.javasdk.models.operations.DeleteConfigResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
        }

        return res;
    }
    
    /**
     * getManyConfigs - Get many configs
     *
     * Sorted by updated date descending
    **/
    public dev.formance.javasdk.models.operations.GetManyConfigsResponse getManyConfigs(dev.formance.javasdk.models.operations.GetManyConfigsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/webhooks/configs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = dev.formance.javasdk.utils.Utils.getQueryParams(request.queryParams);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.GetManyConfigsResponse res = new dev.formance.javasdk.models.operations.GetManyConfigsResponse() {{
            configsResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ConfigsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConfigsResponse.class);
                res.configsResponse = out;
            }
        }

        return res;
    }
    
    /**
     * insertConfig - Insert a new config
     *
     * Insert a new webhooks config.
     * 
     * The endpoint should be a valid https URL and be unique.
     * 
     * The secret is the endpoint's verification secret.
     * If not passed or empty, a secret is automatically generated.
     * The format is a random string of bytes of size 24, base64 encoded. (larger size after encoding)
     * 
     * All eventTypes are converted to lower-case when inserted.
     * 
    **/
    public dev.formance.javasdk.models.operations.InsertConfigResponse insertConfig(dev.formance.javasdk.models.operations.InsertConfigRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/webhooks/configs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        if (serializedRequestBody == null) {
            throw new Exception("Request body is required");
        }
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.InsertConfigResponse res = new dev.formance.javasdk.models.operations.InsertConfigResponse() {{
            configResponse = null;
            insertConfig400TextPlainString = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ConfigResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConfigResponse.class);
                res.configResponse = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "text/plain")) {
                String out = new String(httpRes.body(), StandardCharsets.UTF_8);
                res.insertConfig400TextPlainString = out;
            }
        }

        return res;
    }
    
    /**
     * testConfig - Test one config
     *
     * Test a config by sending a webhook to its endpoint.
    **/
    public dev.formance.javasdk.models.operations.TestConfigResponse testConfig(dev.formance.javasdk.models.operations.TestConfigRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/webhooks/configs/{id}/test", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.TestConfigResponse res = new dev.formance.javasdk.models.operations.TestConfigResponse() {{
            attemptResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.AttemptResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.AttemptResponse.class);
                res.attemptResponse = out;
            }
        }

        return res;
    }
}