import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ListAccountsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=ledger" })
  ledger: string;
}
export enum ListAccountsBalanceOperatorEnum {
    Gte = "gte",
    Lte = "lte",
    Gt = "gt",
    Lt = "lt",
    E = "e",
    Ne = "ne"
}

export class ListAccountsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=address" })
  address?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=after" })
  after?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=balance" })
  balance?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=balanceOperator" })
  balanceOperator?: ListAccountsBalanceOperatorEnum;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=cursor" })
  cursor?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=deepObject;explode=true;name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=pageSize" })
  pageSize?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=pagination_token" })
  paginationToken?: string;
}

export class ListAccountsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: ListAccountsPathParams;

  @SpeakeasyMetadata()
  queryParams: ListAccountsQueryParams;
}

export class ListAccountsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  accountsCursorResponse?: shared.AccountsCursorResponse;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  errorResponse?: shared.ErrorResponse;

  @SpeakeasyMetadata()
  statusCode: number;
}