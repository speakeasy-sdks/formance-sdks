import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Scope } from "./scope";


export class ReadScopeResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Scope;
}