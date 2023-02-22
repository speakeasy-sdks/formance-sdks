package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import dev.formance.javasdk.utils.JSON;
import dev.formance.javasdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class Clients {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Clients(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * addScopeToClient - Add scope to client
    **/
    public dev.formance.javasdk.models.operations.AddScopeToClientResponse addScopeToClient(dev.formance.javasdk.models.operations.AddScopeToClientRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients/{clientId}/scopes/{scopeId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.AddScopeToClientResponse res = new dev.formance.javasdk.models.operations.AddScopeToClientResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * createClient - Create client
    **/
    public dev.formance.javasdk.models.operations.CreateClientResponse createClient(dev.formance.javasdk.models.operations.CreateClientRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.CreateClientResponse res = new dev.formance.javasdk.models.operations.CreateClientResponse() {{
            createClientResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.CreateClientResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.CreateClientResponse.class);
                res.createClientResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createSecret - Add a secret to a client
    **/
    public dev.formance.javasdk.models.operations.CreateSecretResponse createSecret(dev.formance.javasdk.models.operations.CreateSecretRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients/{clientId}/secrets", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.CreateSecretResponse res = new dev.formance.javasdk.models.operations.CreateSecretResponse() {{
            createSecretResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.CreateSecretResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.CreateSecretResponse.class);
                res.createSecretResponse = out;
            }
        }

        return res;
    }
    
    /**
     * deleteClient - Delete client
    **/
    public dev.formance.javasdk.models.operations.DeleteClientResponse deleteClient(dev.formance.javasdk.models.operations.DeleteClientRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients/{clientId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.DeleteClientResponse res = new dev.formance.javasdk.models.operations.DeleteClientResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * deleteScopeFromClient - Delete scope from client
    **/
    public dev.formance.javasdk.models.operations.DeleteScopeFromClientResponse deleteScopeFromClient(dev.formance.javasdk.models.operations.DeleteScopeFromClientRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients/{clientId}/scopes/{scopeId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.DeleteScopeFromClientResponse res = new dev.formance.javasdk.models.operations.DeleteScopeFromClientResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * deleteSecret - Delete a secret from a client
    **/
    public dev.formance.javasdk.models.operations.DeleteSecretResponse deleteSecret(dev.formance.javasdk.models.operations.DeleteSecretRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients/{clientId}/secrets/{secretId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.DeleteSecretResponse res = new dev.formance.javasdk.models.operations.DeleteSecretResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * listClients - List clients
    **/
    public dev.formance.javasdk.models.operations.ListClientsResponse listClients() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ListClientsResponse res = new dev.formance.javasdk.models.operations.ListClientsResponse() {{
            listClientsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ListClientsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ListClientsResponse.class);
                res.listClientsResponse = out;
            }
        }

        return res;
    }
    
    /**
     * readClient - Read client
    **/
    public dev.formance.javasdk.models.operations.ReadClientResponse readClient(dev.formance.javasdk.models.operations.ReadClientRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients/{clientId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ReadClientResponse res = new dev.formance.javasdk.models.operations.ReadClientResponse() {{
            readClientResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ReadClientResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ReadClientResponse.class);
                res.readClientResponse = out;
            }
        }

        return res;
    }
    
    /**
     * updateClient - Update client
    **/
    public dev.formance.javasdk.models.operations.UpdateClientResponse updateClient(dev.formance.javasdk.models.operations.UpdateClientRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/clients/{clientId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PUT");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.UpdateClientResponse res = new dev.formance.javasdk.models.operations.UpdateClientResponse() {{
            updateClientResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.UpdateClientResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.UpdateClientResponse.class);
                res.updateClientResponse = out;
            }
        }

        return res;
    }
}