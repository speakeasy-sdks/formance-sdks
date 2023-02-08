import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Scope } from "./scope";


export class UpdateScopeResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Scope;
}