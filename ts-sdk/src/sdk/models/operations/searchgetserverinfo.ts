import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class SearchgetServerInfoResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  serverInfo?: shared.ServerInfo;

  @SpeakeasyMetadata()
  statusCode: number;
}