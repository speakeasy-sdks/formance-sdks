import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class AggregateBalancesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Record<string, number>;
}