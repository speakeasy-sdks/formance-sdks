import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Stats } from "./stats";


export class StatsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Stats;
}