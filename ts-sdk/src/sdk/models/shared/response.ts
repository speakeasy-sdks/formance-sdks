import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class ResponseCursorTotal extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=relation" })
  relation?: string;

  @SpeakeasyMetadata({ data: "json, name=value" })
  value?: number;
}

export class ResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Record<string, any>[];

  @SpeakeasyMetadata({ data: "json, name=hasMore" })
  hasMore?: boolean;

  @SpeakeasyMetadata({ data: "json, name=next" })
  next?: string;

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize?: number;

  @SpeakeasyMetadata({ data: "json, name=previous" })
  previous?: string;

  @SpeakeasyMetadata({ data: "json, name=total" })
  total?: ResponseCursorTotal;
}

export class Response extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor?: ResponseCursor;

  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Record<string, any>;
}