import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Contract } from "./contract";


export class Mapping extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=contracts", elemType: Contract })
  contracts: Contract[];
}