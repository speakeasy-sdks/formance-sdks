import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class AccountWithVolumesAndBalances extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=address" })
  address: string;

  @SpeakeasyMetadata({ data: "json, name=balances" })
  balances?: Record<string, number>;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type?: string;

  @SpeakeasyMetadata({ data: "json, name=volumes" })
  volumes?: Record<string, Record<string, number>>;
}