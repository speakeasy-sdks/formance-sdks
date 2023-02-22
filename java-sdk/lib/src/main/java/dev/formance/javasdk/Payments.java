package dev.formance.javasdk;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.formance.javasdk.utils.HTTPClient;
import dev.formance.javasdk.utils.HTTPRequest;
import dev.formance.javasdk.utils.JSON;
import dev.formance.javasdk.utils.SerializedBody;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.apache.http.NameValuePair;

public class Payments {
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Payments(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}
    
    /**
     * connectorsStripeTransfer - Transfer funds between Stripe accounts
     *
     * Execute a transfer between two Stripe accounts.
    **/
    public dev.formance.javasdk.models.operations.ConnectorsStripeTransferResponse connectorsStripeTransfer(dev.formance.javasdk.models.operations.ConnectorsStripeTransferRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/stripe/transfer");
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ConnectorsStripeTransferResponse res = new dev.formance.javasdk.models.operations.ConnectorsStripeTransferResponse() {{
            stripeTransferResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                java.util.Map<String, Object> out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), java.util.Map.class);
                res.stripeTransferResponse = out;
            }
        }

        return res;
    }
    
    /**
     * getConnectorTask - Read a specific task of the connector
     *
     * Get a specific task associated to the connector.
    **/
    public dev.formance.javasdk.models.operations.GetConnectorTaskResponse getConnectorTask(dev.formance.javasdk.models.operations.GetConnectorTaskRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/{connector}/tasks/{taskId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.GetConnectorTaskResponse res = new dev.formance.javasdk.models.operations.GetConnectorTaskResponse() {{
            taskResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.TaskResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.TaskResponse.class);
                res.taskResponse = out;
            }
        }

        return res;
    }
    
    /**
     * getPayment - Get a payment
    **/
    public dev.formance.javasdk.models.operations.GetPaymentResponse getPayment(dev.formance.javasdk.models.operations.GetPaymentRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/payments/{paymentId}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.GetPaymentResponse res = new dev.formance.javasdk.models.operations.GetPaymentResponse() {{
            paymentResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.PaymentResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.PaymentResponse.class);
                res.paymentResponse = out;
            }
        }

        return res;
    }
    
    /**
     * installConnector - Install a connector
     *
     * Install a connector by its name and config.
    **/
    public dev.formance.javasdk.models.operations.InstallConnectorResponse installConnector(dev.formance.javasdk.models.operations.InstallConnectorRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/{connector}", request.pathParams);
        
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

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.InstallConnectorResponse res = new dev.formance.javasdk.models.operations.InstallConnectorResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * listAllConnectors - List all installed connectors
     *
     * List all installed connectors.
    **/
    public dev.formance.javasdk.models.operations.ListAllConnectorsResponse listAllConnectors() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ListAllConnectorsResponse res = new dev.formance.javasdk.models.operations.ListAllConnectorsResponse() {{
            connectorsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ConnectorsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConnectorsResponse.class);
                res.connectorsResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listConfigsAvailableConnectors - List the configs of each available connector
     *
     * List the configs of each available connector.
    **/
    public dev.formance.javasdk.models.operations.ListConfigsAvailableConnectorsResponse listConfigsAvailableConnectors() throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/configs");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ListConfigsAvailableConnectorsResponse res = new dev.formance.javasdk.models.operations.ListConfigsAvailableConnectorsResponse() {{
            connectorsConfigsResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ConnectorsConfigsResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConnectorsConfigsResponse.class);
                res.connectorsConfigsResponse = out;
            }
        }

        return res;
    }
    
    /**
     * listConnectorTasks - List tasks from a connector
     *
     * List all tasks associated with this connector.
    **/
    public dev.formance.javasdk.models.operations.ListConnectorTasksResponse listConnectorTasks(dev.formance.javasdk.models.operations.ListConnectorTasksRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/{connector}/tasks", request.pathParams);
        
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

        dev.formance.javasdk.models.operations.ListConnectorTasksResponse res = new dev.formance.javasdk.models.operations.ListConnectorTasksResponse() {{
            tasksCursor = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.TasksCursor out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.TasksCursor.class);
                res.tasksCursor = out;
            }
        }

        return res;
    }
    
    /**
     * listPayments - List payments
    **/
    public dev.formance.javasdk.models.operations.ListPaymentsResponse listPayments(dev.formance.javasdk.models.operations.ListPaymentsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/payments");
        
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

        dev.formance.javasdk.models.operations.ListPaymentsResponse res = new dev.formance.javasdk.models.operations.ListPaymentsResponse() {{
            paymentsCursor = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.PaymentsCursor out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.PaymentsCursor.class);
                res.paymentsCursor = out;
            }
        }

        return res;
    }
    
    /**
     * paymentslistAccounts - List accounts
    **/
    public dev.formance.javasdk.models.operations.PaymentslistAccountsResponse paymentslistAccounts(dev.formance.javasdk.models.operations.PaymentslistAccountsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/accounts");
        
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

        dev.formance.javasdk.models.operations.PaymentslistAccountsResponse res = new dev.formance.javasdk.models.operations.PaymentslistAccountsResponse() {{
            accountsCursor = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.AccountsCursor out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.AccountsCursor.class);
                res.accountsCursor = out;
            }
        }

        return res;
    }
    
    /**
     * readConnectorConfig - Read the config of a connector
     *
     * Read connector config
    **/
    public dev.formance.javasdk.models.operations.ReadConnectorConfigResponse readConnectorConfig(dev.formance.javasdk.models.operations.ReadConnectorConfigRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/{connector}/config", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ReadConnectorConfigResponse res = new dev.formance.javasdk.models.operations.ReadConnectorConfigResponse() {{
            connectorConfigResponse = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 200) {
            if (dev.formance.javasdk.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                dev.formance.javasdk.models.shared.ConnectorConfigResponse out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), dev.formance.javasdk.models.shared.ConnectorConfigResponse.class);
                res.connectorConfigResponse = out;
            }
        }

        return res;
    }
    
    /**
     * resetConnector - Reset a connector
     *
     * Reset a connector by its name.
     * It will remove the connector and ALL PAYMENTS generated with it.
     * 
    **/
    public dev.formance.javasdk.models.operations.ResetConnectorResponse resetConnector(dev.formance.javasdk.models.operations.ResetConnectorRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/{connector}/reset", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.ResetConnectorResponse res = new dev.formance.javasdk.models.operations.ResetConnectorResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
    
    /**
     * uninstallConnector - Uninstall a connector
     *
     * Uninstall a connector by its name.
    **/
    public dev.formance.javasdk.models.operations.UninstallConnectorResponse uninstallConnector(dev.formance.javasdk.models.operations.UninstallConnectorRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = dev.formance.javasdk.utils.Utils.generateURL(baseUrl, "/api/payments/connectors/{connector}", request.pathParams);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        dev.formance.javasdk.models.operations.UninstallConnectorResponse res = new dev.formance.javasdk.models.operations.UninstallConnectorResponse() {{
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        
        if (httpRes.statusCode() == 204) {
        }

        return res;
    }
}