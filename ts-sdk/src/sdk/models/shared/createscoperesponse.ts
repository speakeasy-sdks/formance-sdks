import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Scope } from "./scope";


export class CreateScopeResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Scope;
}