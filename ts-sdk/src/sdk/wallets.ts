import * as utils from "../internal/utils";
import * as operations from "./models/operations";
import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";

export class Wallets {
  _defaultClient: AxiosInstance;
  _securityClient: AxiosInstance;
  _serverURL: string;
  _language: string;
  _sdkVersion: string;
  _genVersion: string;

  constructor(defaultClient: AxiosInstance, securityClient: AxiosInstance, serverURL: string, language: string, sdkVersion: string, genVersion: string) {
    this._defaultClient = defaultClient;
    this._securityClient = securityClient;
    this._serverURL = serverURL;
    this._language = language;
    this._sdkVersion = sdkVersion;
    this._genVersion = genVersion;
  }
  
  /**
   * confirmHold - Confirm a hold
  **/
  confirmHold(
    req: operations.ConfirmHoldRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.ConfirmHoldResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.ConfirmHoldRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/holds/{hold_id}/confirm", req.pathParams);

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    
    const r = client.request({
      url: url,
      method: "post",
      headers: headers,
      data: reqBody, 
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.ConfirmHoldResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * createBalance - Create a balance
  **/
  createBalance(
    req: operations.CreateBalanceRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.CreateBalanceResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.CreateBalanceRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/wallets/{id}/balances", req.pathParams);

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    
    const r = client.request({
      url: url,
      method: "post",
      headers: headers,
      data: reqBody, 
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.CreateBalanceResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.createBalanceResponse = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * createWallet - Create a new wallet
  **/
  createWallet(
    req: operations.CreateWalletRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.CreateWalletResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.CreateWalletRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/wallets/wallets";

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    
    const r = client.request({
      url: url,
      method: "post",
      headers: headers,
      data: reqBody, 
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.CreateWalletResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 201:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.createWalletResponse = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * creditWallet - Credit a wallet
  **/
  creditWallet(
    req: operations.CreditWalletRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.CreditWalletResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.CreditWalletRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/wallets/{id}/credit", req.pathParams);

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    
    const r = client.request({
      url: url,
      method: "post",
      headers: headers,
      data: reqBody, 
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.CreditWalletResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * debitWallet - Debit a wallet
  **/
  debitWallet(
    req: operations.DebitWalletRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.DebitWalletResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.DebitWalletRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/wallets/{id}/debit", req.pathParams);

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    
    const r = client.request({
      url: url,
      method: "post",
      headers: headers,
      data: reqBody, 
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.DebitWalletResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.debitWalletResponse = httpRes?.data;
            }
            break;
          case httpRes?.status == 204:
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * getBalance - Get detailed balance
  **/
  getBalance(
    req: operations.GetBalanceRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetBalanceResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetBalanceRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/wallets/{id}/balances/{balanceName}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetBalanceResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getBalanceResponse = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * getHold - Get a hold
  **/
  getHold(
    req: operations.GetHoldRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetHoldResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetHoldRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/holds/{holdID}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetHoldResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getHoldResponse = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * getHolds - Get all holds for a wallet
  **/
  getHolds(
    req: operations.GetHoldsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetHoldsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetHoldsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/wallets/holds";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetHoldsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getHoldsResponse = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  getTransactions(
    req: operations.GetTransactionsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetTransactionsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetTransactionsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/wallets/transactions";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetTransactionsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getTransactionsResponse = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * getWallet - Get a wallet
  **/
  getWallet(
    req: operations.GetWalletRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.GetWalletResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.GetWalletRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/wallets/{id}", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.GetWalletResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.getWalletResponse = httpRes?.data;
            }
            break;
          case httpRes?.status == 404:
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * listBalances - List balances of a wallet
  **/
  listBalances(
    req: operations.ListBalancesRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.ListBalancesResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.ListBalancesRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/wallets/{id}/balances", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.ListBalancesResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.listBalancesResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * listWallets - List all wallets
  **/
  listWallets(
    req: operations.ListWalletsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.ListWalletsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.ListWalletsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/wallets/wallets";
    
    const client: AxiosInstance = this._securityClient!;
    
    const qpSerializer: ParamsSerializerOptions = utils.getQueryParamSerializer(req.queryParams);

    const requestConfig: AxiosRequestConfig = {
      ...config,
      params: req.queryParams,
      paramsSerializer: qpSerializer,
    };
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...requestConfig,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.ListWalletsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.listWalletsResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * updateWallet - Update a wallet
  **/
  updateWallet(
    req: operations.UpdateWalletRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.UpdateWalletResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.UpdateWalletRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/wallets/{id}", req.pathParams);

    let [reqBodyHeaders, reqBody]: [object, any] = [{}, {}];

    try {
      [reqBodyHeaders, reqBody] = utils.serializeRequestBody(req);
    } catch (e: unknown) {
      if (e instanceof Error) {
        throw new Error(`Error serializing request body, cause: ${e.message}`);
      }
    }
    
    const client: AxiosInstance = this._securityClient!;
    
    const headers = {...reqBodyHeaders, ...config?.headers};
    
    const r = client.request({
      url: url,
      method: "patch",
      headers: headers,
      data: reqBody, 
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.UpdateWalletResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * voidHold - Cancel a hold
  **/
  voidHold(
    req: operations.VoidHoldRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.VoidHoldResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.VoidHoldRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/wallets/holds/{hold_id}/void", req.pathParams);
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "post",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.VoidHoldResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 204:
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

  
  /**
   * walletsgetServerInfo - Get server info
  **/
  walletsgetServerInfo(
    config?: AxiosRequestConfig
  ): Promise<operations.WalletsgetServerInfoResponse> {
    const baseURL: string = this._serverURL;
    const url: string = baseURL.replace(/\/$/, "") + "/api/wallets/_info";
    
    const client: AxiosInstance = this._securityClient!;
    
    
    const r = client.request({
      url: url,
      method: "get",
      ...config,
    });
    
    return r.then((httpRes: AxiosResponse) => {
        const contentType: string = httpRes?.headers?.["content-type"] ?? "";

        if (httpRes?.status == null) throw new Error(`status code not found in response: ${httpRes}`);
        const res: operations.WalletsgetServerInfoResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.serverInfo = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.walletsErrorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

}
