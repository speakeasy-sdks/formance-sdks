import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ConnectorEnum } from "./connectorenum";

export enum PaymentsAccountTypeEnum {
    Target = "TARGET",
    Source = "SOURCE"
}

export class PaymentsAccount extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=createdAt" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=provider" })
  provider: ConnectorEnum;

  @SpeakeasyMetadata({ data: "json, name=reference" })
  reference: string;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PaymentsAccountTypeEnum;
}