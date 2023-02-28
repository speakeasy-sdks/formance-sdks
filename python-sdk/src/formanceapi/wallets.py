import requests
from . import utils
from formanceapi.models import operations, shared
from typing import Optional

class Wallets:
    _client: requests.Session
    _security_client: requests.Session
    _server_url: str
    _language: str
    _sdk_version: str
    _gen_version: str

    def __init__(self, client: requests.Session, security_client: requests.Session, server_url: str, language: str, sdk_version: str, gen_version: str) -> None:
        self._client = client
        self._security_client = security_client
        self._server_url = server_url
        self._language = language
        self._sdk_version = sdk_version
        self._gen_version = gen_version

    
    def confirm_hold(self, request: operations.ConfirmHoldRequest) -> operations.ConfirmHoldResponse:
        r"""Confirm a hold
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/holds/{hold_id}/confirm", request.path_params)
        
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("POST", url, data=data, files=form, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.ConfirmHoldResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def create_balance(self, request: operations.CreateBalanceRequest) -> operations.CreateBalanceResponse:
        r"""Create a balance
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/wallets/{id}/balances", request.path_params)
        
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("POST", url, data=data, files=form, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.CreateBalanceResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.CreateBalanceResponse])
                res.create_balance_response = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def create_wallet(self, request: operations.CreateWalletRequest) -> operations.CreateWalletResponse:
        r"""Create a new wallet
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/wallets/wallets"
        
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("POST", url, data=data, files=form, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.CreateWalletResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 201:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.CreateWalletResponse])
                res.create_wallet_response = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def credit_wallet(self, request: operations.CreditWalletRequest) -> operations.CreditWalletResponse:
        r"""Credit a wallet
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/wallets/{id}/credit", request.path_params)
        
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("POST", url, data=data, files=form, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.CreditWalletResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def debit_wallet(self, request: operations.DebitWalletRequest) -> operations.DebitWalletResponse:
        r"""Debit a wallet
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/wallets/{id}/debit", request.path_params)
        
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("POST", url, data=data, files=form, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.DebitWalletResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.DebitWalletResponse])
                res.debit_wallet_response = out
        elif r.status_code == 204:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def get_balance(self, request: operations.GetBalanceRequest) -> operations.GetBalanceResponse:
        r"""Get detailed balance
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/wallets/{id}/balances/{balanceName}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetBalanceResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.GetBalanceResponse])
                res.get_balance_response = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def get_hold(self, request: operations.GetHoldRequest) -> operations.GetHoldResponse:
        r"""Get a hold
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/holds/{holdID}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetHoldResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.GetHoldResponse])
                res.get_hold_response = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def get_holds(self, request: operations.GetHoldsRequest) -> operations.GetHoldsResponse:
        r"""Get all holds for a wallet
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/wallets/holds"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetHoldsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.GetHoldsResponse])
                res.get_holds_response = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def get_transactions(self, request: operations.GetTransactionsRequest) -> operations.GetTransactionsResponse:
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/wallets/transactions"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.GetTransactionsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.GetTransactionsResponse])
                res.get_transactions_response = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def get_wallet(self, request: operations.GetWalletRequest) -> operations.GetWalletResponse:
        r"""Get a wallet
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/wallets/{id}", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.GetWalletResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.GetWalletResponse])
                res.get_wallet_response = out
        elif r.status_code == 404:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def list_balances(self, request: operations.ListBalancesRequest) -> operations.ListBalancesResponse:
        r"""List balances of a wallet
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/wallets/{id}/balances", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.ListBalancesResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ListBalancesResponse])
                res.list_balances_response = out

        return res

    
    def list_wallets(self, request: operations.ListWalletsRequest) -> operations.ListWalletsResponse:
        r"""List all wallets
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/wallets/wallets"
        
        query_params = utils.get_query_params(request.query_params)
        
        client = self._security_client
        
        r = client.request("GET", url, params=query_params)
        content_type = r.headers.get("Content-Type")

        res = operations.ListWalletsResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ListWalletsResponse])
                res.list_wallets_response = out

        return res

    
    def update_wallet(self, request: operations.UpdateWalletRequest) -> operations.UpdateWalletResponse:
        r"""Update a wallet
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/wallets/{id}", request.path_params)
        
        headers = {}
        req_content_type, data, form = utils.serialize_request_body(request)
        if req_content_type != "multipart/form-data" and req_content_type != "multipart/mixed":
            headers["content-type"] = req_content_type
        
        client = self._security_client
        
        r = client.request("PATCH", url, data=data, files=form, headers=headers)
        content_type = r.headers.get("Content-Type")

        res = operations.UpdateWalletResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def void_hold(self, request: operations.VoidHoldRequest) -> operations.VoidHoldResponse:
        r"""Cancel a hold
        """
        
        base_url = self._server_url
        
        url = utils.generate_url(base_url, "/api/wallets/holds/{hold_id}/void", request.path_params)
        
        
        client = self._security_client
        
        r = client.request("POST", url)
        content_type = r.headers.get("Content-Type")

        res = operations.VoidHoldResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 204:
            pass
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    
    def walletsget_server_info(self) -> operations.WalletsgetServerInfoResponse:
        r"""Get server info
        """
        
        base_url = self._server_url
        
        url = base_url.removesuffix("/") + "/api/wallets/_info"
        
        
        client = self._security_client
        
        r = client.request("GET", url)
        content_type = r.headers.get("Content-Type")

        res = operations.WalletsgetServerInfoResponse(status_code=r.status_code, content_type=content_type)
        
        if r.status_code == 200:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.ServerInfo])
                res.server_info = out
        else:
            if utils.match_content_type(content_type, "application/json"):
                out = utils.unmarshal_json(r.text, Optional[shared.WalletsErrorResponse])
                res.wallets_error_response = out

        return res

    