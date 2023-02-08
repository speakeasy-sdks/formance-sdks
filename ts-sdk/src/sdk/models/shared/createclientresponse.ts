import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Client } from "./client";


export class CreateClientResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Client;
}