package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import dev.formance.javasdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class Scopes {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Scopes(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * addTransientScope - Add a transient scope to a scope
     *
     * Add a transient scope to a scope
    **/
    public dev.formance.javasdk.models.operations.AddTransientScopeResponse addTransientScope(dev.formance.javasdk.models.operations.AddTransientScopeRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/scopes/{scopeId}/transient/{transientScopeId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.AddTransientScopeResponse res = new dev.formance.javasdk.models.operations.AddTransientScopeResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * createScope - Create scope
     *
     * Create scope
    **/
    public dev.formance.javasdk.models.operations.CreateScopeResponse createScope(dev.formance.javasdk.models.operations.CreateScopeRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/scopes");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.CreateScopeResponse res = new dev.formance.javasdk.models.operations.CreateScopeResponse() {{
            createScopeResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.CreateScopeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.CreateScopeResponse.class);
                res.createScopeResponse = out;
            }
        }

        return res;
    }
    
    /**
     * deleteScope - Delete scope
     *
     * Delete scope
    **/
    public dev.formance.javasdk.models.operations.DeleteScopeResponse deleteScope(dev.formance.javasdk.models.operations.DeleteScopeRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/scopes/{scopeId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.DeleteScopeResponse res = new dev.formance.javasdk.models.operations.DeleteScopeResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * deleteTransientScope - Delete a transient scope from a scope
     *
     * Delete a transient scope from a scope
    **/
    public dev.formance.javasdk.models.operations.DeleteTransientScopeResponse deleteTransientScope(dev.formance.javasdk.models.operations.DeleteTransientScopeRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/scopes/{scopeId}/transient/{transientScopeId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.DeleteTransientScopeResponse res = new dev.formance.javasdk.models.operations.DeleteTransientScopeResponse() {{
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * listScopes - List scopes
     *
     * List Scopes
    **/
    public dev.formance.javasdk.models.operations.ListScopesResponse listScopes() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/scopes");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.ListScopesResponse res = new dev.formance.javasdk.models.operations.ListScopesResponse() {{
            listScopesResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ListScopesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ListScopesResponse.class);
                res.listScopesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * readScope - Read scope
     *
     * Read scope
    **/
    public dev.formance.javasdk.models.operations.ReadScopeResponse readScope(dev.formance.javasdk.models.operations.ReadScopeRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/scopes/{scopeId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.ReadScopeResponse res = new dev.formance.javasdk.models.operations.ReadScopeResponse() {{
            readScopeResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ReadScopeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ReadScopeResponse.class);
                res.readScopeResponse = out;
            }
        }

        return res;
    }
    
    /**
     * updateScope - Update scope
     *
     * Update scope
    **/
    public dev.formance.javasdk.models.operations.UpdateScopeResponse updateScope(dev.formance.javasdk.models.operations.UpdateScopeRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/scopes/{scopeId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.UpdateScopeResponse res = new dev.formance.javasdk.models.operations.UpdateScopeResponse() {{
            updateScopeResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.UpdateScopeResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.UpdateScopeResponse.class);
                res.updateScopeResponse = out;
            }
        }

        return res;
    }
}