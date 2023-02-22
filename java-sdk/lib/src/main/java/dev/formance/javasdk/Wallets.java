package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import dev.formance.javasdk.utils.JSON;
import dev.formance.javasdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Wallets {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Wallets(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * confirmHold - Confirm a hold
    **/
    public dev.formance.javasdk.models.operations.ConfirmHoldResponse confirmHold(dev.formance.javasdk.models.operations.ConfirmHoldRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/holds/{hold_id}/confirm", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ConfirmHoldResponse res = new dev.formance.javasdk.models.operations.ConfirmHoldResponse() {{
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createBalance - Create a balance
    **/
    public dev.formance.javasdk.models.operations.CreateBalanceResponse createBalance(dev.formance.javasdk.models.operations.CreateBalanceRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets/{id}/balances", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.CreateBalanceResponse res = new dev.formance.javasdk.models.operations.CreateBalanceResponse() {{
            createBalanceResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.CreateBalanceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.CreateBalanceResponse.class);
                res.createBalanceResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * createWallet - Create a new wallet
    **/
    public dev.formance.javasdk.models.operations.CreateWalletResponse createWallet(dev.formance.javasdk.models.operations.CreateWalletRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.CreateWalletResponse res = new dev.formance.javasdk.models.operations.CreateWalletResponse() {{
            createWalletResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 201) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.CreateWalletResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.CreateWalletResponse.class);
                res.createWalletResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * creditWallet - Credit a wallet
    **/
    public dev.formance.javasdk.models.operations.CreditWalletResponse creditWallet(dev.formance.javasdk.models.operations.CreditWalletRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets/{id}/credit", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.CreditWalletResponse res = new dev.formance.javasdk.models.operations.CreditWalletResponse() {{
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * debitWallet - Debit a wallet
    **/
    public dev.formance.javasdk.models.operations.DebitWalletResponse debitWallet(dev.formance.javasdk.models.operations.DebitWalletRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets/{id}/debit", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.DebitWalletResponse res = new dev.formance.javasdk.models.operations.DebitWalletResponse() {{
            debitWalletResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.DebitWalletResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.DebitWalletResponse.class);
                res.debitWalletResponse = out;
            }
        }
        else if (httpRes.statusCode() == 204) {
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * getBalance - Get detailed balance
    **/
    public dev.formance.javasdk.models.operations.GetBalanceResponse getBalance(dev.formance.javasdk.models.operations.GetBalanceRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets/{id}/balances/{balanceName}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.GetBalanceResponse res = new dev.formance.javasdk.models.operations.GetBalanceResponse() {{
            getBalanceResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.GetBalanceResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.GetBalanceResponse.class);
                res.getBalanceResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * getHold - Get a hold
    **/
    public dev.formance.javasdk.models.operations.GetHoldResponse getHold(dev.formance.javasdk.models.operations.GetHoldRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/holds/{holdID}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.GetHoldResponse res = new dev.formance.javasdk.models.operations.GetHoldResponse() {{
            getHoldResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.GetHoldResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.GetHoldResponse.class);
                res.getHoldResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * getHolds - Get all holds for a wallet
    **/
    public dev.formance.javasdk.models.operations.GetHoldsResponse getHolds(dev.formance.javasdk.models.operations.GetHoldsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/holds");
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.GetHoldsResponse res = new dev.formance.javasdk.models.operations.GetHoldsResponse() {{
            getHoldsResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.GetHoldsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.GetHoldsResponse.class);
                res.getHoldsResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    public dev.formance.javasdk.models.operations.GetTransactionsResponse getTransactions(dev.formance.javasdk.models.operations.GetTransactionsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/transactions");
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.GetTransactionsResponse res = new dev.formance.javasdk.models.operations.GetTransactionsResponse() {{
            getTransactionsResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.GetTransactionsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.GetTransactionsResponse.class);
                res.getTransactionsResponse = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * getWallet - Get a wallet
    **/
    public dev.formance.javasdk.models.operations.GetWalletResponse getWallet(dev.formance.javasdk.models.operations.GetWalletRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.GetWalletResponse res = new dev.formance.javasdk.models.operations.GetWalletResponse() {{
            getWalletResponse = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.GetWalletResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.GetWalletResponse.class);
                res.getWalletResponse = out;
            }
        }
        else if (httpRes.statusCode() == 404) {
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listBalances - List balances of a wallet
    **/
    public dev.formance.javasdk.models.operations.ListBalancesResponse listBalances(dev.formance.javasdk.models.operations.ListBalancesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets/{id}/balances", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ListBalancesResponse res = new dev.formance.javasdk.models.operations.ListBalancesResponse() {{
            listBalancesResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ListBalancesResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ListBalancesResponse.class);
                res.listBalancesResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listWallets - List all wallets
    **/
    public dev.formance.javasdk.models.operations.ListWalletsResponse listWallets(dev.formance.javasdk.models.operations.ListWalletsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets");
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ListWalletsResponse res = new dev.formance.javasdk.models.operations.ListWalletsResponse() {{
            listWalletsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ListWalletsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ListWalletsResponse.class);
                res.listWalletsResponse = out;
            }
        }

        return res;
    }
    
    /**
     * updateWallet - Update a wallet
    **/
    public dev.formance.javasdk.models.operations.UpdateWalletResponse updateWallet(dev.formance.javasdk.models.operations.UpdateWalletRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/wallets/{id}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("PATCH");
        req.setURL(url);
        SerializedBody serializedRequestBody = dev.formance.javasdk.utils.Utils.serializeRequestBody(request);
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.UpdateWalletResponse res = new dev.formance.javasdk.models.operations.UpdateWalletResponse() {{
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * voidHold - Cancel a hold
    **/
    public dev.formance.javasdk.models.operations.VoidHoldResponse voidHold(dev.formance.javasdk.models.operations.VoidHoldRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/holds/{hold_id}/void", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.VoidHoldResponse res = new dev.formance.javasdk.models.operations.VoidHoldResponse() {{
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
    
    /**
     * walletsgetServerInfo - Get server info
    **/
    public dev.formance.javasdk.models.operations.WalletsgetServerInfoResponse walletsgetServerInfo() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/wallets/_info");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.WalletsgetServerInfoResponse res = new dev.formance.javasdk.models.operations.WalletsgetServerInfoResponse() {{
            serverInfo = null;
            walletsErrorResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ServerInfo out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ServerInfo.class);
                res.serverInfo = out;
            }
        }
        else {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.WalletsErrorResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.WalletsErrorResponse.class);
                res.walletsErrorResponse = out;
            }
        }

        return res;
    }
}