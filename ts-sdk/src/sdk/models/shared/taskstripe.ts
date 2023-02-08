import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { PaymentStatusEnum } from "./paymentstatusenum";


export class TaskStripeDescriptor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=account" })
  account: string;

  @SpeakeasyMetadata({ data: "json, name=main" })
  main?: boolean;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}

export class TaskStripe extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=connectorId" })
  connectorId: string;

  @SpeakeasyMetadata({ data: "json, name=createdAt" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=descriptor" })
  descriptor: TaskStripeDescriptor;

  @SpeakeasyMetadata({ data: "json, name=error" })
  error?: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=state" })
  state: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=status" })
  status: PaymentStatusEnum;

  @SpeakeasyMetadata({ data: "json, name=updatedAt" })
  updatedAt: Date;
}