import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ListClientsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  listClientsResponse?: shared.ListClientsResponse;

  @SpeakeasyMetadata()
  statusCode: number;
}