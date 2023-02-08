import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Client } from "./client";


export class ListClientsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data", elemType: Client })
  data?: Client[];
}