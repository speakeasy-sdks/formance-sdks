import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Posting } from "./posting";
import { Volume } from "./volume";


export class Transaction extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=postCommitVolumes", elemType: Volume, elemDepth: 2 })
  postCommitVolumes?: Record<string, Record<string, Volume>>;

  @SpeakeasyMetadata({ data: "json, name=postings", elemType: Posting })
  postings: Posting[];

  @SpeakeasyMetadata({ data: "json, name=preCommitVolumes", elemType: Volume, elemDepth: 2 })
  preCommitVolumes?: Record<string, Record<string, Volume>>;

  @SpeakeasyMetadata({ data: "json, name=reference" })
  reference?: string;

  @SpeakeasyMetadata({ data: "json, name=timestamp" })
  timestamp: Date;

  @SpeakeasyMetadata({ data: "json, name=txid" })
  txid: number;
}