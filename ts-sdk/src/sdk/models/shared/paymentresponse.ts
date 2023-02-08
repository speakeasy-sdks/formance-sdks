import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Payment } from "./payment";


export class PaymentResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Payment;
}