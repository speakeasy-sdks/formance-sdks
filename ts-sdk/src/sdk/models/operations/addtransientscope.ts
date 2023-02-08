import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class AddTransientScopePathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=scopeId" })
  scopeId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=transientScopeId" })
  transientScopeId: string;
}

export class AddTransientScopeRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: AddTransientScopePathParams;
}

export class AddTransientScopeResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}