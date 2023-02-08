import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class LedgerStorage extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=driver" })
  driver: string;

  @SpeakeasyMetadata({ data: "json, name=ledgers" })
  ledgers: string[];
}