import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Mapping } from "./mapping";


export class MappingResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=data" })
  data?: Mapping;
}