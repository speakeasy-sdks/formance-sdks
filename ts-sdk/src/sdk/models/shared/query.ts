import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Query extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=after" })
  after?: string[];

  @SpeakeasyMetadata({ data: "json, name=cursor" })
  cursor?: string;

  @SpeakeasyMetadata({ data: "json, name=ledgers" })
  ledgers?: string[];

  @SpeakeasyMetadata({ data: "json, name=pageSize" })
  pageSize?: number;

  @SpeakeasyMetadata({ data: "json, name=policy" })
  policy?: string;

  @SpeakeasyMetadata({ data: "json, name=sort" })
  sort?: string;

  @SpeakeasyMetadata({ data: "json, name=target" })
  target?: string;

  @SpeakeasyMetadata({ data: "json, name=terms" })
  terms?: string[];
}