import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { PaymentStatusEnum } from "./paymentstatusenum";


export class PaymentAdjustment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=absolute" })
  absolute: boolean;

  @SpeakeasyMetadata({ data: "json, name=amount" })
  amount: number;

  @SpeakeasyMetadata({ data: "json, name=date" })
  date: Date;

  @SpeakeasyMetadata({ data: "json, name=raw" })
  raw: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: PaymentStatusEnum;
}