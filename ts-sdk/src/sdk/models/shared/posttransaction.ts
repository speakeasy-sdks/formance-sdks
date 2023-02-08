import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Posting } from "./posting";


export class PostTransactionScript extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=plain" })
  plain: string;

  @SpeakeasyMetadata({ data: "json, name=vars" })
  vars?: Record<string, any>;
}

export class PostTransaction extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=postings", elemType: Posting })
  postings?: Posting[];

  @SpeakeasyMetadata({ data: "json, name=reference" })
  reference?: string;

  @SpeakeasyMetadata({ data: "json, name=script" })
  script?: PostTransactionScript;

  @SpeakeasyMetadata({ data: "json, name=timestamp" })
  timestamp?: Date;
}