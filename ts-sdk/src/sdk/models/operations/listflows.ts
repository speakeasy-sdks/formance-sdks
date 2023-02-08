import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ListFlowsResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  error?: shared.ErrorT;

  @SpeakeasyMetadata()
  listWorkflowsResponse?: shared.ListWorkflowsResponse;

  @SpeakeasyMetadata()
  statusCode: number;
}