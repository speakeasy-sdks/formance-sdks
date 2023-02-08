import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ConnectorEnum } from "./connectorenum";
import { PaymentAdjustment } from "./paymentadjustment";
import { PaymentMetadata } from "./paymentmetadata";
import { PaymentStatusEnum } from "./paymentstatusenum";

export enum PaymentSchemeEnum {
    Visa = "visa",
    Mastercard = "mastercard",
    Amex = "amex",
    Diners = "diners",
    Discover = "discover",
    Jcb = "jcb",
    Unionpay = "unionpay",
    SepaDebit = "sepa debit",
    SepaCredit = "sepa credit",
    Sepa = "sepa",
    ApplePay = "apple pay",
    GooglePay = "google pay",
    A2a = "a2a",
    AchDebit = "ach debit",
    Ach = "ach",
    Rtp = "rtp",
    Unknown = "unknown",
    Other = "other"
}
export enum PaymentTypeEnum {
    PayIn = "PAY-IN",
    Payout = "PAYOUT",
    Transfer = "TRANSFER",
    Other = "OTHER"
}

export class Payment extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=accountID" })
  accountID: string;

  @SpeakeasyMetadata({ data: "json, name=adjustments", elemType: PaymentAdjustment })
  adjustments: PaymentAdjustment[];

  @SpeakeasyMetadata({ data: "json, name=asset" })
  asset: string;

  @SpeakeasyMetadata({ data: "json, name=createdAt" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=initialAmount" })
  initialAmount: number;

  @SpeakeasyMetadata({ data: "json, name=metadata", elemType: PaymentMetadata })
  metadata: PaymentMetadata[];

  @SpeakeasyMetadata({ data: "json, name=provider" })
  provider: ConnectorEnum;

  @SpeakeasyMetadata({ data: "json, name=raw" })
  raw: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=reference" })
  reference: string;

  @SpeakeasyMetadata({ data: "json, name=scheme" })
  scheme: PaymentSchemeEnum;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: PaymentStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: PaymentTypeEnum;
}