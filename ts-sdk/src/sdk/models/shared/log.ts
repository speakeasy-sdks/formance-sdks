import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";

export enum LogTypeEnum {
    NewTransaction = "NEW_TRANSACTION",
    SetMetadata = "SET_METADATA"
}

export class Log extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=date" })
  date: Date;

  @SpeakeasyMetadata({ data: "json, name=hash" })
  hash: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: number;

  @SpeakeasyMetadata({ data: "json, name=type" })
  type: LogTypeEnum;
}