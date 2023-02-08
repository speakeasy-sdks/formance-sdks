import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class Script extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=plain" })
  plain: string;

  @SpeakeasyMetadata({ data: "json, name=reference" })
  reference?: string;

  @SpeakeasyMetadata({ data: "json, name=vars" })
  vars?: Record<string, any>;
}