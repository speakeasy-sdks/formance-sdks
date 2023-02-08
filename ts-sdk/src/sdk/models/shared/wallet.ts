import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Wallet extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=createdAt" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=ledger" })
  ledger: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}