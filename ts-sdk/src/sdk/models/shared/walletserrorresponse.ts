import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";

export enum WalletsErrorResponseErrorCodeEnum {
    Validation = "VALIDATION"
}

export class WalletsErrorResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=errorCode" })
  errorCode: WalletsErrorResponseErrorCodeEnum;

  @SpeakeasyMetadata({ data: "json, name=errorMessage" })
  errorMessage: string;
}