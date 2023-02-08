import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Contract extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=account" })
  account?: string;

  @SpeakeasyMetadata({ data: "json, name=expr" })
  expr: Record<string, any>;
}