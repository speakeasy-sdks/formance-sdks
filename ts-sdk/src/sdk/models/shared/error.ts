import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";

export enum ErrorErrorCodeEnum {
    Validation = "VALIDATION"
}

export class ErrorT extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=errorCode" })
  errorCode: ErrorErrorCodeEnum;

  @SpeakeasyMetadata({ data: "json, name=errorMessage" })
  errorMessage: string;
}