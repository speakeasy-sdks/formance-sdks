import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";


export class DeleteClientPathParams extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "pathParam, style=simple;explode=false;name=clientId" })
  clientId: string;
}

export class DeleteClientRequest extends SpeakeasyBase {
  @SpeakeasyMetadata()
  pathParams: DeleteClientPathParams;
}

export class DeleteClientResponse extends SpeakeasyBase {
  @SpeakeasyMetadata()
  contentType: string;

  @SpeakeasyMetadata()
  statusCode: number;
}