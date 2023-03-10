import dataclasses
import dateutil.parser
from ..shared import errorresponse as shared_errorresponse
from datetime import datetime
from marshmallow import fields
from typing import Any, Optional


@dataclasses.dataclass
class CountTransactionsPathParams:
    ledger: str = dataclasses.field(metadata={'path_param': { 'field_name': 'ledger', 'style': 'simple', 'explode': False }})
    

@dataclasses.dataclass
class CountTransactionsQueryParams:
    account: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'account', 'style': 'form', 'explode': True }})
    destination: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'destination', 'style': 'form', 'explode': True }})
    end_time: Optional[datetime] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'endTime', 'style': 'form', 'explode': True }})
    metadata: Optional[dict[str, Any]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'metadata', 'style': 'deepObject', 'explode': True }})
    reference: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'reference', 'style': 'form', 'explode': True }})
    source: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'source', 'style': 'form', 'explode': True }})
    start_time: Optional[datetime] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'startTime', 'style': 'form', 'explode': True }})
    

@dataclasses.dataclass
class CountTransactionsRequest:
    path_params: CountTransactionsPathParams = dataclasses.field()
    query_params: CountTransactionsQueryParams = dataclasses.field()
    

@dataclasses.dataclass
class CountTransactionsResponse:
    content_type: str = dataclasses.field()
    headers: dict[str, list[str]] = dataclasses.field()
    status_code: int = dataclasses.field()
    error_response: Optional[shared_errorresponse.ErrorResponse] = dataclasses.field(default=None)
    