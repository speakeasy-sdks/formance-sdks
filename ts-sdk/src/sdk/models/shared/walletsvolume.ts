import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class WalletsVolume extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=balance" })
  balance: number;

  @SpeakeasyMetadata({ data: "json, name=input" })
  input: number;

  @SpeakeasyMetadata({ data: "json, name=output" })
  output: number;
}