package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import dev.formance.javasdk.utils.JSON;
import dev.formance.javasdk.utils.SpeakeasyHTTPClient;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;


public class FormanceAPI {
	public static final String[] SERVERS = {
		"http://localhost",
		"https://{organization}.sandbox.formance.cloud",
	};
  	
  	public Accounts accounts;
  	public Balances balances;
  	public Clients clients;
  	public Ledger ledger;
  	public Logs logs;
  	public Mapping mapping;
  	public Orchestration orchestration;
  	public Payments payments;
  	public Scopes scopes;
  	public Script script;
  	public Search search;
  	public Server server;
  	public Stats stats;
  	public Transactions transactions;
  	public Users users;
  	public Wallets wallets;
  	public Webhooks webhooks;	

	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private dev.formance.javasdk.models.shared.Security _security;
	private String _serverUrl;
	private String _language = "java";
	private String _sdkVersion = "1.5.1";
	private String _genVersion = "1.5.3";

	public static class Builder {
		private HTTPClient client;
		private dev.formance.javasdk.models.shared.Security security;
		private String serverUrl;
		private java.util.Map<String, String> params = new java.util.HashMap<String, String>();

		private Builder() {
		}

		public Builder setClient(HTTPClient client) {
			this.client = client;
			return this;
		}
		
		public Builder setSecurity(dev.formance.javasdk.models.shared.Security security) {
			this.security = security;
			return this;
		}
		
		public Builder setServerURL(String serverUrl) {
			this.serverUrl = serverUrl;
			return this;
		}
		
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.serverUrl = serverUrl;
			this.params = params;
			return this;
		}
		
		public FormanceAPI build() throws Exception {
			return new FormanceAPI(this.client, this.security, this.serverUrl, this.params);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	private FormanceAPI(HTTPClient client, dev.formance.javasdk.models.shared.Security security, String serverUrl, java.util.Map<String, String> params) throws Exception {
		this._defaultClient = client;
		
		if (this._defaultClient == null) {
			this._defaultClient = new SpeakeasyHTTPClient();
		}
		
		if (security != null) {
			this._security = security;
			this._securityClient = dev.formance.javasdk.utils.Utils.configureSecurityClient(this._defaultClient, this._security);
		}
		
		if (this._securityClient == null) {
			this._securityClient = this._defaultClient;
		}

		if (serverUrl != null && !serverUrl.isBlank()) {
			this._serverUrl = dev.formance.javasdk.utils.Utils.replaceParameters(serverUrl, params);
		}
		
		if (this._serverUrl == null) {
			this._serverUrl = SERVERS[0];
		}
		
		this.accounts = new Accounts(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.balances = new Balances(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.clients = new Clients(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.ledger = new Ledger(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.logs = new Logs(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.mapping = new Mapping(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.orchestration = new Orchestration(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.payments = new Payments(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.scopes = new Scopes(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.script = new Script(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.search = new Search(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.server = new Server(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.stats = new Stats(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.transactions = new Transactions(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.users = new Users(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.wallets = new Wallets(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
		
		this.webhooks = new Webhooks(
			this._defaultClient,
			this._securityClient,
			this._serverUrl,
			this._language,
			this._sdkVersion,
			this._genVersion
		);
	}
    
    /**
     * paymentsgetServerInfo - Get server info
    **/
    public dev.formance.javasdk.models.operations.PaymentsgetServerInfoResponse paymentsgetServerInfo() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/_info");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.PaymentsgetServerInfoResponse res = new dev.formance.javasdk.models.operations.PaymentsgetServerInfoResponse() {{
            serverInfo = null;
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

        return res;
    }
    
    /**
     * searchgetServerInfo - Get server info
    **/
    public dev.formance.javasdk.models.operations.SearchgetServerInfoResponse searchgetServerInfo() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/search/_info");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.SearchgetServerInfoResponse res = new dev.formance.javasdk.models.operations.SearchgetServerInfoResponse() {{
            serverInfo = null;
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

        return res;
    }
}