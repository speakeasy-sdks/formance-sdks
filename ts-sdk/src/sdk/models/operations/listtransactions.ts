import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ListTransactionsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=ledger" })
  ledger: string;
}

export class ListTransactionsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=account" })
  account?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=after" })
  after?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=cursor" })
  cursor?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=destination" })
  destination?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=endTime" })
  endTime?: Date;

  @SpeakeasyMetadata({ data: "queryParam, style=deepObject;explode=true;name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=pageSize" })
  pageSize?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=pagination_token" })
  paginationToken?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=reference" })
  reference?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=source" })
  source?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=startTime" })
  startTime?: Date;
}

export class ListTransactionsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: ListTransactionsPathParams;

  @SpeakeasyMetadata()
  queryParams: ListTransactionsQueryParams;
}

export class ListTransactionsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  errorResponse?: shared.ErrorResponse;

  @SpeakeasyMetadata()
  statusCode: number;

  @SpeakeasyMetadata()
  transactionsCursorResponse?: shared.TransactionsCursorResponse;
}