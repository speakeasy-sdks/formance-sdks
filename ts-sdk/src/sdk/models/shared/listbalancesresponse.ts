import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Balance } from "./balance";
import { Expose, Type } from "class-transformer";


export class ListBalancesResponseCursor extends SpeakeasyBase {
  @SpeakeasyMetadata({ elemType: Balance })
  @Expose({ name: "data" })
  @Type(() => Balance)
  data: Balance[];

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

export class ListBalancesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  @Expose({ name: "cursor" })
  @Type(() => ListBalancesResponseCursor)
  cursor: ListBalancesResponseCursor;
}