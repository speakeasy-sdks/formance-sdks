import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Scope } from "./scope";


export class ListScopesResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Scope })
  data?: Scope[];
}