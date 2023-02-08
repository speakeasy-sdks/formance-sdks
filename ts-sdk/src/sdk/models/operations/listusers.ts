import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ListUsersResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  listUsersResponse?: shared.ListUsersResponse;

  @SpeakeasyMetadata()
  statusCode: number;
}