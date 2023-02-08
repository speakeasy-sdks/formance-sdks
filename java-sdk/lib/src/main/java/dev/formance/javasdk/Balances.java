package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.apache.http.NameValuePair;

public class Balances {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Balances(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * getBalances - Get the balances from a ledger's account
    **/
    public dev.formance.javasdk.models.operations.GetBalancesResponse getBalances(dev.formance.javasdk.models.operations.GetBalancesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/ledger/{ledger}/balances", request.pathParams);
        
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

        dev.formance.javasdk.models.operations.GetBalancesResponse res = new dev.formance.javasdk.models.operations.GetBalancesResponse() {{
            balancesCursorResponse = null;
            errorResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.BalancesCursorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.BalancesCursorResponse.class);
                res.balancesCursorResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * getBalancesAggregated - Get the aggregated balances from selected accounts
    **/
    public dev.formance.javasdk.models.operations.GetBalancesAggregatedResponse getBalancesAggregated(dev.formance.javasdk.models.operations.GetBalancesAggregatedRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/ledger/{ledger}/aggregate/balances", request.pathParams);
        
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

        dev.formance.javasdk.models.operations.GetBalancesAggregatedResponse res = new dev.formance.javasdk.models.operations.GetBalancesAggregatedResponse() {{
            aggregateBalancesResponse = null;
            errorResponse = null;
        }};
        res.statusCode = Long.valueOf(httpRes.statusCode());
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.AggregateBalancesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.AggregateBalancesResponse.class);
                res.aggregateBalancesResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.findAndRegisterModules();
                dev.formance.javasdk.models.shared.ErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ErrorResponse.class);
                res.errorResponse = out;
            }
        }

        return res;
    }
}