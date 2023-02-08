import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class DeleteSecretPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=clientId" })
  clientId: string;

  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=secretId" })
  secretId: string;
}

export class DeleteSecretRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: DeleteSecretPathParams;
}

export class DeleteSecretResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}