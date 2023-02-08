import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { ErrorsEnumEnum } from "./errorsenumenum";


export class ErrorResponse extends SpeakeasyBase {
  @SpeakeasyMetadata({ data: "json, name=details" })
  details?: string;

  @SpeakeasyMetadata({ data: "json, name=errorCode" })
  errorCode?: ErrorsEnumEnum;

  @SpeakeasyMetadata({ data: "json, name=errorMessage" })
  errorMessage?: string;
}