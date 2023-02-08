import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { LedgerStorage } from "./ledgerstorage";


export class Config extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=storage" })
  storage: LedgerStorage;
}