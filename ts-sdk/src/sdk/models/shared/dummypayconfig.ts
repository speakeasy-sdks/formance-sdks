import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class DummyPayConfig extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=directory" })
  directory: string;

  @SpeakeasyMetadata({ data: "json, name=fileGenerationPeriod" })
  fileGenerationPeriod?: string;

  @SpeakeasyMetadata({ data: "json, name=filePollingPeriod" })
  filePollingPeriod?: string;
}