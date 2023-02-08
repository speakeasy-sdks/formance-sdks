package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;

public class Users {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Users(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * listUsers - List users
     *
     * List users
    **/
    public dev.formance.javasdk.models.operations.ListUsersResponse listUsers() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/users");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.ListUsersResponse res = new dev.formance.javasdk.models.operations.ListUsersResponse() {{
            listUsersResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ListUsersResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ListUsersResponse.class);
                res.listUsersResponse = out;
            }
        }

        return res;
    }
    
    /**
     * readUser - Read user
     *
     * Read user
    **/
    public dev.formance.javasdk.models.operations.ReadUserResponse readUser(dev.formance.javasdk.models.operations.ReadUserRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/auth/users/{userId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().allValues("Content-Type").get(0);

        dev.formance.javasdk.models.operations.ReadUserResponse res = new dev.formance.javasdk.models.operations.ReadUserResponse() {{
            readUserResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ReadUserResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ReadUserResponse.class);
                res.readUserResponse = out;
            }
        }

        return res;
    }
}