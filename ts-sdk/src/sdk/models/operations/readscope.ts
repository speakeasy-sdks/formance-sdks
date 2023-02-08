import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import * as shared from "../shared";


export class ReadScopePathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scopeId" })
  scopeId: string;
}

export class ReadScopeRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: ReadScopePathParams;
}

export class ReadScopeResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  readScopeResponse?: shared.ReadScopeResponse;

  @SpeakeasyMetadata()
  statusCode: number;
}