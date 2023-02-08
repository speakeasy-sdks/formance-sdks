import * as utils from "../internal/utils";
import * as operations from "./models/operations";
import { AxiosInstance, AxiosRequestConfig, AxiosResponse, ParamsSerializerOptions } from "axios";

export class Logs {
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
   * listLogs - List the logs from a ledger
   *
   * List the logs from a ledger, sorted by ID in descending order.
  **/
  listLogs(
    req: operations.ListLogsRequest,
    config?: AxiosRequestConfig
  ): Promise<operations.ListLogsResponse> {
    if (!(req instanceof utils.SpeakeasyBase)) {
      req = new operations.ListLogsRequest(req);
    }
    
    const baseURL: string = this._serverURL;
    const url: string = utils.generateURL(baseURL, "/api/ledger/{ledger}/log", req.pathParams);
    
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
        const res: operations.ListLogsResponse = {statusCode: httpRes.status, contentType: contentType};
        switch (true) {
          case httpRes?.status == 200:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.logsCursorResponse = httpRes?.data;
            }
            break;
          default:
            if (utils.matchContentType(contentType, `application/json`)) {
                res.errorResponse = httpRes?.data;
            }
            break;
        }

        return res;
      })
  }

}
