import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Secret extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=clear" })
  clear: string;

  @SpeakeasyMetadata({ data: "json, name=id" })
  id: string;

  @SpeakeasyMetadata({ data: "json, name=lastDigits" })
  lastDigits: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=name" })
  name: string;
}