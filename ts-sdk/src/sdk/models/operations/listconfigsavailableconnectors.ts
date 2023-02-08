import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ListConfigsAvailableConnectorsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  connectorsConfigsResponse?: shared.ConnectorsConfigsResponse;

  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}