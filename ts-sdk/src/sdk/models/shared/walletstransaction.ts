import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Posting } from "./posting";
import { WalletsVolume } from "./walletsvolume";


export class WalletsTransaction extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=metadata" })
  metadata?: Record<string, any>;

  @SpeakeasyMetadata({ data: "json, name=postCommitVolumes", elemType: WalletsVolume, elemDepth: 2 })
  postCommitVolumes?: Record<string, Record<string, WalletsVolume>>;

  @SpeakeasyMetadata({ data: "json, name=postings", elemType: Posting })
  postings: Posting[];

  @SpeakeasyMetadata({ data: "json, name=preCommitVolumes", elemType: WalletsVolume, elemDepth: 2 })
  preCommitVolumes?: Record<string, Record<string, WalletsVolume>>;

  @SpeakeasyMetadata({ data: "json, name=reference" })
  reference?: string;

  @SpeakeasyMetadata({ data: "json, name=timestamp" })
  timestamp: Date;

  @SpeakeasyMetadata({ data: "json, name=txid" })
  txid: number;
}