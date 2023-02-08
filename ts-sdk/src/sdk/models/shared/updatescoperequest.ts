import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class UpdateScopeRequest extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=label" })
  label: string;

  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;
}