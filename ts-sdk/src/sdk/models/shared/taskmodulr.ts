import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { PaymentStatusEnum } from "./paymentstatusenum";


export class TaskModulrDescriptor extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=accountID" })
  accountID?: string;

  @SpeakeasyMetadata({ data: "json, name=key" })
  key?: string;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name?: string;
}

export class TaskModulr extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=connectorId" })
  connectorId: string;

  @SpeakeasyMetadata({ data: "json, name=createdAt" })
  createdAt: Date;

  @SpeakeasyMetadata({ data: "json, name=descriptor" })
  descriptor: TaskModulrDescriptor;

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