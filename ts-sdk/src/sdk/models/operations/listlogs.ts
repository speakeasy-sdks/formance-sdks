import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ListLogsPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=ledger" })
  ledger: string;
}

export class ListLogsQueryParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=after" })
  after?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=cursor" })
  cursor?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=endTime" })
  endTime?: Date;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=pageSize" })
  pageSize?: number;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=pagination_token" })
  paginationToken?: string;

  @SpeakeasyMetadata({ data: "queryParam, style=form;explode=true;name=startTime" })
  startTime?: Date;
}

export class ListLogsRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: ListLogsPathParams;

  @SpeakeasyMetadata()
  queryParams: ListLogsQueryParams;
}

export class ListLogsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  errorResponse?: shared.ErrorResponse;

  @SpeakeasyMetadata()
  logsCursorResponse?: shared.LogsCursorResponse;

  @SpeakeasyMetadata()
  statusCode: number;
}