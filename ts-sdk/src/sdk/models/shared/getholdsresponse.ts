import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Hold } from "./hold";
import { Expose, Type } from "class-transformer";


export class GetHoldsResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ elemType: Hold })
  @Expose({ name: "data" })
  @Type(() => Hold)
  data: Hold[];

  @SpeakeasyMetadata()
  @Expose({ name: "hasMore" })
  hasMore?: boolean;

  @SpeakeasyMetadata()
  @Expose({ name: "next" })
  next?: string;

  @SpeakeasyMetadata()
  @Expose({ name: "pageSize" })
  pageSize: number;

  @SpeakeasyMetadata()
  @Expose({ name: "previous" })
  previous?: string;
}

export class GetHoldsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "cursor" })
  @Type(() => GetHoldsResponseCursor)
  cursor: GetHoldsResponseCursor;
}